package com.example.demo.databinding;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

//    @InitBinder
//    public void init(WebDataBinder webDataBinder){
//        webDataBinder.registerCustomEditor(BindData.class, new EventEditor());
//    }

    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable BindData bindData){
        System.out.println(bindData);
        return bindData.getId().toString();
    }
}
