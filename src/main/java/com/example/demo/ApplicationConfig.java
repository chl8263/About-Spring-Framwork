package com.example.demo;

import com.example.demo.book.BookRepository;
import com.example.demo.book.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Application.class)
public class ApplicationConfig {

}
