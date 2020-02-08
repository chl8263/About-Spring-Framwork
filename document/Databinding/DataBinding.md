# DataBinding

### What is DataBinding?

Spring DataBinding is mapping to domain from user input value.

Server read just string for user input value.

So, Need mapping to specific object or data type.

Here is some controller for mapping input value.

~~~java
@RestController
public class EventController {

    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable BindData bindData){
        System.out.println(bindData);
        return bindData.getId().toString();
    }
}
~~~

And BindData object is like that.

~~~java
public class BindData {

    private Integer id;

    private String title;

    public BindData(Integer id){
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BindData{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
~~~

Test code for above code like below.

~~~java
@RunWith(SpringRunner.class)
@WebMvcTest
public class EventControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getTest() throws Exception{
        mockMvc.perform(get("/event/1"))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().string("1"));
    }
}
~~~

The result is fail.

~~~
Missing URI template variable 'bindData' for method parameter of type BindData]
~~~

In this case, have to notify to spring how can transform data.

First of all, can use PropertyEditorSupport like below code.

~~~java
public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {

        BindData binddata = (BindData)getValue();

        return binddata.getId().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new BindData(Integer.parseInt(text)));
    }
}
~~~

When use PropertyEditorSupport for format data type, can use getAsText() and setAsText().
'getAsText()' method is binding object to string. 'setAsText' method is binding string to object.

However this way has some problem and too old. For example, not thread safe, can not register Bean, just can transform string to object or object to string.

