package dev.kipijz.eventviewer.repositories;

import dev.kipijz.eventviewer.models.Event;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventRepository extends MongoRepository<Event, ObjectId> {
    Optional<Event> findEventByEventId(String eventId);
}
