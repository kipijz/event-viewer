package dev.kipijz.eventviewer.repositories;

import dev.kipijz.eventviewer.models.Comment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, ObjectId> {



}
