package com.example.demo.eventPublisher;

import org.springframework.context.event.*;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnotherHandler {

    @EventListener
    @Async
    //@Order(Ordered.HIGHEST_PRECEDENCE + 2)
    public void handle(MyEvent myEvent){
        System.out.println("Current Thread -> " + Thread.currentThread().toString());
        System.out.println("Another -> "+myEvent.getData());
    }

    @EventListener
    public void handle(ContextRefreshedEvent event){
        System.out.println("Refresh");
    }

    @EventListener
    public void handle(ContextStartedEvent event){
        System.out.println("Start");
    }

    @EventListener
    public void handle(ContextStoppedEvent event){
        System.out.println("Stop");
    }

    @EventListener
    public void handle(ContextClosedEvent event){
        System.out.println("Close");
    }
}
