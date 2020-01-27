package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository ewanBookRepository;

    @PostConstruct
    public void setUp(){
        //System.out.println(ewanBookRepository.getClass());
    }

//    @Autowired
//    List<BookRepository> bookRepositoryList;
//
//    @PostConstruct
//    public void setUp(){
//        bookRepositoryList.forEach(x ->
//                System.out.println(x.getClass())
//        );
//    }
}
