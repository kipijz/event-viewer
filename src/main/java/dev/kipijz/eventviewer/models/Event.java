package dev.kipijz.eventviewer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    @Id
    private ObjectId id;
    private String eventId;
    private String title;
    private String date;
    private String promoLink;
    private String poster;
    private String backdrop;
    @DocumentReference
    private List<Comment> commentIds;
}
