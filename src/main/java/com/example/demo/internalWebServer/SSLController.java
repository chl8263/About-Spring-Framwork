package com.example.demo.internalWebServer;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSLController {

    @GetMapping("/hello")
    public String hello(){
        return "hello spring";
    }

//    @Bean // set can able http
//    public ServletWebServerFactory serverFactory(){
//        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
//        factory.addAdditionalTomcatConnectors(createStandatdConnector());
//        return factory;
//    }
//
//    private Connector createStandatdConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setPort(8080);
//        return connector;
//    }
}
