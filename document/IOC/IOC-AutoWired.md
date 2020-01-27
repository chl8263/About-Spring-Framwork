# IOC Autowired

### What is IOC Autowired?

IOC : Inversion of control, Rather than creating and using dependent objects directly, inject an object.

- How to inject using Autowired annotation?
    1. @Primary
    2. List
    3. @Qualifier


##### 1. @Primary

As BookService like below code. There are repository which extends BookRepository.

~~~java
public interface BookRepository {
}

@Repository
public class EwanBookRepository implements BookRepository {
}

@Repository
public class MyBookRepository implements BookRepository {
}
~~~


Then which BookRepository being inject?.

We can see BookRepository class name from setUp method with @PostConstruct.

~~~java
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void setUp(){
        System.out.println(bookRepository.getClass());
    }    
}
~~~

Result is fail because spring don't know which class inject.

~~~
Exception in thread "task-2" org.springframework.beans.factory.BeanCreationNotAllowedException: Error creating bean with name 'springApplicationAdminRegistrar': Singleton bean creation not allowed while singletons of this factory are in destruction (Do not request a bean from a BeanFactory in a destroy method implementation!)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:208)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:321)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:207)
	at org.springframework.context.event.AbstractApplicationEventMulticaster.retrieveApplicationListeners(AbstractApplicationEventMulticaster.java:245)
	at org.springframework.context.event.AbstractApplicationEventMulticaster.getApplicationListeners(AbstractApplicationEventMulticaster.java:197)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:134)
	at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:403)
	at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:360)
	at org.springframework.boot.autoconfigure.orm.jpa.DataSourceInitializedPublisher.publishEventIfRequired(DataSourceInitializedPublisher.java:99)
	at org.springframework.boot.autoconfigure.orm.jpa.DataSourceInitializedPublisher.access$100(DataSourceInitializedPublisher.java:50)
	at org.springframework.boot.autoconfigure.orm.jpa.DataSourceInitializedPublisher$DataSourceSchemaCreatedPublisher.lambda$postProcessEntityManagerFactory$0(DataSourceInitializedPublisher.java:200)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
	at java.lang.Thread.run(Thread.java:748)
~~~