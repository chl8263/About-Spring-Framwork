package com.example.demo.aop;

public interface EventService {

    void createEvent() throws InterruptedException;

    void publishEvent() throws InterruptedException;

    void deleteEvent();
}
