package com.example.demo;

import com.example.demo.book.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

//        //ApplicationContext context = new ClassPathXmlApplicationContext("application111.xml");
//
//        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        String [] beanNames = context.getBeanDefinitionNames();
//        System.out.println(beanNames);
//
//        BookService bookService = (BookService) context.getBean("bookService");
//
//        System.out.println(bookService.getBookRepository() != null);
    }
}
