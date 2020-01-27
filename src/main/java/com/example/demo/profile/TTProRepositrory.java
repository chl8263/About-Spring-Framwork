package com.example.demo.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("!test")
public class TTProRepositrory implements ProRepository {

    @Override
    public String printState() {
        return "Not test!";
    }
}
