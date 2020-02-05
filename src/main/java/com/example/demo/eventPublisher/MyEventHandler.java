package com.example.demo.eventPublisher;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {//implements ApplicationListener<MyEvent> {

    @EventListener//@Override
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("Current Thread -> " + Thread.currentThread().toString());
        System.out.println("Event occurred -> " + myEvent.getData());
    }

    @EventListener//@Override
    @Async
    public void handle(MyEvent myEvent) {
        System.out.println("Current Thread -> " + Thread.currentThread().toString());
        System.out.println("Event occurred -> " + myEvent.getData());
    }
}
