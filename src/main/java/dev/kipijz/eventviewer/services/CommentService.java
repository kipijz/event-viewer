package dev.kipijz.eventviewer.services;

import dev.kipijz.eventviewer.models.Comment;
import dev.kipijz.eventviewer.repositories.CommentRepository;
import dev.kipijz.eventviewer.models.Event;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    public final CommentRepository commentRepository;
    private final MongoTemplate mongoTemplate;

    public Comment create(String body, String eventId) {
        Comment comment = commentRepository.insert(Comment.builder()
                .body(body)
                .build());
        mongoTemplate.update(Event.class)
                .matching(Criteria.where("eventId").is(eventId))
                .apply(new Update().push("commentIds").value(comment))
                .first();

        return comment;
    }
}
