package com.example.demo.resourceLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Component
public class LoaderRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        URL url = new URL("http://www.google.com");
//        URLConnection urlConnection = url.openConnection();
//        InputStream inputStream = urlConnection.getInputStream();
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        Resource res = resourceLoader.getResource("classpath:test.txt");

        if(res.exists()){

            String data = "";

            InputStream inputStream = res.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            while (true){
                data = bufferedReader.readLine();
                if(data == null) break;
                System.out.println(data);
            }
        }



//        System.out.println(resourceLoader.getClass());
//
//        Resource res = resourceLoader.getResource("classpath:test.txt");
//        System.out.println(res.getClass());
//        System.out.println(res.exists());
    }
}
