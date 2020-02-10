package com.example.demo.aop;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{
    @Override
    @PerfLogging
    public void createEvent() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("Create an event");
    }

    @Override
    @PerfLogging
    public void publishEvent() throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("Published an event");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Delete an Event");
    }
}

