package com.example.demo.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class TestProRepository implements ProRepository {

    @Override
    public String printState() {
        return "Test!!!";
    }
}
