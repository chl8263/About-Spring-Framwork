# Spring IOC

### What is Spring IOC?

IOC : Inversion of control, Rather than creating and using dependent objects directly, inject an object.

- Spring IOC container
    - BeanFactory
    - Center storage of application component
    - Read bean definitions from bean configuration source, configure and serve beans

Make configuration file like the picture below.

![base](/document/IOC/container.PNG)

Configure using XML file and annotation.

~~~xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="bookService"  --> Enroll class to use bean
          class="com.example.demo.book.BookService"  --> Write class path
          scope="singleton">  --> Write scope singleton or prototype and so on
        <property name="bookRepository" ref="bookRepository"/>
    </bean>

    <bean id="bookRepository"
          class="com.example.demo.book.BookRepository"
    />
</beans>
~~~
     
- Bean
    - The object which manage from Spring IOC container
    - Benefit
        - Manage dependency
        - Scope
            - Singleton
            - Prototype
        - Life cycle interface
        
