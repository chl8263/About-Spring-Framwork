package com.example.demo;

import com.example.demo.profile.ProRepository;
import com.example.demo.profile.TestProRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//@Configuration
//@Profile("test")
public class TestConfiguration {
//    @Bean
//    public ProRepository proRepository(){
//        return new TestProRepository();
//    }
}
//-Dspring.profiles.active="test"