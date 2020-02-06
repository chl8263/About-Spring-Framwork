package com.example.demo.eventPublisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

//@Component
public class EventRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher eventPublisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        eventPublisher.publishEvent(new MyEvent(this, 100));

        ((ConfigurableApplicationContext)eventPublisher).start();
        ((ConfigurableApplicationContext)eventPublisher).stop();
        ((ConfigurableApplicationContext)eventPublisher).close();
    }
}
