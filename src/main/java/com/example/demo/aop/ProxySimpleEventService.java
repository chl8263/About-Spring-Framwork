package com.example.demo.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component
public class ProxySimpleEventService implements EventService{

    @Autowired
    SimpleEventService simpleEventService;

    @Override
    public void createEvent() throws InterruptedException {
        long begin = System.currentTimeMillis();

        simpleEventService.createEvent();

        System.out.println(System.currentTimeMillis() - begin);

    }

    @Override
    public void publishEvent() throws InterruptedException {
        long begin = System.currentTimeMillis();
        simpleEventService.publishEvent();
        System.out.println(System.currentTimeMillis() - begin);

    }

    @Override
    public void deleteEvent() {
        simpleEventService.deleteEvent();
    }
}
