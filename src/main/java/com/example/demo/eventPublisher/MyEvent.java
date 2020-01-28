package com.example.demo.eventPublisher;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    private int data;

    public MyEvent(Object source) {
        super(source);
    }

}
