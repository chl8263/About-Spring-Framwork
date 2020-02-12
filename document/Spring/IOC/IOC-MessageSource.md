# IOC Container - MessageSource

### What is IOC MessageSource?

MessageSource 
Interface providing internationalization(i18n) functionality.

If use Spring boot, can use without any setting.

First of all, create file like below.

![base](/document/Spring/IOCing/IOC/MessageSource.PNG)

Then just use code like below.

~~~java
@Component
public class MessageRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(messageSource.getMessage("greeting", new String[]{"Ewan"}, Locale.KOREA));
        System.out.println(messageSource.getMessage("greeting", new String[]{"Ewan"}, Locale.getDefault()));
    }
}
~~~