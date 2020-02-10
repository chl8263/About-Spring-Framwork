package com.example.demo.databinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class EventFormatter implements Formatter<BindData> {

    @Override
    public BindData parse(String s, Locale locale) throws ParseException {
        return new BindData(Integer.parseInt(s));
    }

    @Override
    public String print(BindData bindData, Locale locale) {
        return String.valueOf(bindData.getId());
    }
}
