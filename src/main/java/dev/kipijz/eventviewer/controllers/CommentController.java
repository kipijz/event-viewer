package dev.kipijz.eventviewer.controllers;

import dev.kipijz.eventviewer.models.Comment;
import dev.kipijz.eventviewer.models.CommentRequest;
import dev.kipijz.eventviewer.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "${event-viewer.comment.api.v1}")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class CommentController {
    private final CommentService service;

    @PostMapping
    public ResponseEntity<Comment> createReview(@RequestBody CommentRequest request) {
        return new ResponseEntity<>(service.create(request.getBody(), request.getEventId()), HttpStatus.CREATED);
    }
}
