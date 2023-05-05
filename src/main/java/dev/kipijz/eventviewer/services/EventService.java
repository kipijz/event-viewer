package dev.kipijz.eventviewer.services;

import dev.kipijz.eventviewer.models.Event;
import dev.kipijz.eventviewer.repositories.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public List<Event> allEvents() {
        return eventRepository.findAll();
    }

    public Optional<Event> singleEvent(String eventId) {
        return eventRepository.findEventByEventId(eventId);
    }

}
