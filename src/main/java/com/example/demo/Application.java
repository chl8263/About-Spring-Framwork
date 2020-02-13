package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootConfiguration
//@ComponentScan  // Spring boot register bean two step, first component for register bean
//@EnableAutoConfiguration    //  Second, register bean from read ComponentScan
//@EnableAsync // Enable async
//@PropertySource("classpath:/app.properties")
public class Application {

    public static void main(String[] args) {//throws LifecycleException {

//        SpringApplication app = new SpringApplication(Application.class);
//        app.setWebApplicationType(WebApplicationType.NONE);
//        app.run(args);
        SpringApplication.run(Application.class, args);

//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(9090);
//
//        Context context = tomcat.addContext("/", "/");
//
//        HttpServlet servlet = new HttpServlet() {
//            @Override
//            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//                PrintWriter printWriter = resp.getWriter();
//
//                printWriter.println("<html> <head> <body> hello </body> </head> </html>");
//            }
//        };
//
//        String servletName = "helloServlet";
//        tomcat.addServlet("/", servletName, servlet);
//        context.addServletMappingDecoded("/hello", servletName);
//
//        tomcat.start();
        //tomcat.getServer().await();
    }
}