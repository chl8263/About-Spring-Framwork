package com.example.demo.eventPublisher;

import org.springframework.context.event.EventListener;
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
}
