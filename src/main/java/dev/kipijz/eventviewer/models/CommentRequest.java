package dev.kipijz.eventviewer.models;

import lombok.Data;

@Data
public class CommentRequest {
    private String body;
    private String eventId;
}
