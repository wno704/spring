package com.wno704.boot.controller;

import com.wno704.boot.model.BlogProperties;
import com.wno704.boot.model.ConfigBean;
import com.wno704.boot.model.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private TestConfigBean testConfigBean;


    @RequestMapping("/")
    String index() {
        return blogProperties.getName()+"——"+blogProperties.getTitle() +
               "\r\n    configBean:" +  configBean.getName()+"——"+configBean.getTitle() + configBean.getWholeTitle() +
                "\r\n   testConfigBean:" +  testConfigBean.getName()+"——"+testConfigBean.getAge();
    }
}
