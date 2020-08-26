package com.wno704.boot;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = XssApplication.class)
public class XssApplicationTests {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mvc;
    private MockHttpSession session;

    @Before
    public void setupMockMvc(){
        System.out.println("______________________________________________________________________________");
        mvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc对象
        session = new MockHttpSession();
        session.setAttribute("token","4324dasde2ew3qdad43wqeda"); //拦截器那边会判断用户是否登录，所以这里注入一个用户
    }

    @Test
    public void contextLoads() throws Exception{

        //mvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc对象
        //session = new MockHttpSession();
        //session.setAttribute("token","4324dasde2ew3qdad43wqeda"); //拦截器那边会判断用户是否登录，所以这里注入一个用户

        mvc.perform(MockMvcRequestBuilders.get("/xss/test?code={name}","<style>body{colorred !important}</style>"));

    }

    @After
    public void afterTest() {
        System.out.println("after test");
    }

}
