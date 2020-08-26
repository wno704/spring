package com.wno704.boot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wno704.boot.service.HelloService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = TestApplication.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    private MockMvc mockMvc;

    @Autowired
    ObjectMapper mapper;

    @Resource
    private HelloService helloService;

    @Autowired
    private WebApplicationContext wac;


    @Before
    public void setupMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void sendPostOrGet() throws Exception {
        //post
        //mockMvc.perform(MockMvcRequestBuilders.get("/hello?name={name}","mrbird"));
        //get
        mockMvc.perform(MockMvcRequestBuilders.post("/helloword?name={name}", 1));
        //fileUpload
        //mockMvc.perform(MockMvcRequestBuilders.fileUpload("/fileupload").file("file", "文件内容".getBytes("utf-8")));
        // 模拟发送一个message参数，值为hello
        //mockMv-c.perform(MockMvcRequestBuilders.get("/hello").param("message", "hello"));
        // 模拟提交一个checkbox值，name为hobby，值为sleep和eat
        //mockMvc.perform(MockMvcRequestBuilders.get("/saveHobby").param("hobby", "sleep", "eat"));

        //也可以直接使用MultiValueMap构建参数
        //MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        //params.add("name", "mrbird");
        //params.add("hobby", "sleep");
        //params.add("hobby", "eat");
        //mockMvc.perform(MockMvcRequestBuilders.get("/hobby/save").params(params));

        //模拟发送JSON参数
        //String jsonStr = "{\"username\":\"Dopa\",\"passwd\":\"ac3af72d9f95161a502fd326865c2f15\",\"status\":\"1\"}";
        //mockMvc.perform(MockMvcRequestBuilders.post("/user/save").content(jsonStr.getBytes()));

        //mockMvc.perform(MockMvcRequestBuilders.get("/index").sessionAttr("token", "23243dsadw2321dwe232"));
        //mockMvc.perform(MockMvcRequestBuilders.get("/index").cookie(new Cookie("cookie", "324sjdwnej32u24b32hj4bj23")));
    }

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("before class test");
    }

    @Before
    public void beforeTest() {
        System.out.println("before test");
    }

    @Test
    public void Test1() {
        Assert.assertEquals("hello",helloService.getName());
        System.out.println("test 1+1=2");
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void Test2() {
        System.out.println("test 2+2=4");
        Assert.assertEquals(4, 2 + 2);
    }

    @After
    public void afterTest() {
        System.out.println("after test");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("after class test");
    }

}
