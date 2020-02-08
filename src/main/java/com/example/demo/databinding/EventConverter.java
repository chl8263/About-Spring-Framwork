package com.example.demo.databinding;


import org.springframework.core.convert.converter.Converter;

public class EventConverter{

    public static class StringToEvetnConvetter implements Converter<String, BindData>{

        @Override
        public BindData convert(String s) {
            return new BindData(Integer.parseInt(s));
        }
    }

    public static class EventtoStringConverter implements Converter<BindData, String>{
        @Override
        public String convert(BindData bindData) {
            return bindData.getId().toString();
        }
    }
}
