package dev.kipijz.eventviewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EventViewerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EventViewerApplication.class, args);
    }
}
