package com.wno704.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wno704.cloud.model.User;
import com.wno704.cloud.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient client;

    @HystrixCommand(fallbackMethod = "defaultByGetUser")
    @RequestMapping("get/{id}")
    public User get(@PathVariable("id") Integer id) throws Exception {

        List<ServiceInstance> list = this.client.getInstances("USER-SERVER");
        String uri = "";
        for (ServiceInstance instance : list) {
            if (instance.getUri() != null && !"".equals(instance.getUri())) {
                uri = instance.getUri().toString();
                break;
            }
        }
        return restTemplate.getForObject(uri + "/provider/user/get/" + id, User.class);
    }

    public User defaultByGetUser(Integer id) {
        System.out.println("客户信息系统异常");
        return new User(-1,"客户信息系统异常","客户信息系统异常");
    }

    @RequestMapping("getUser/{id}")
    public User getUser(@PathVariable("id") Integer id) throws Exception {
        return restTemplate.getForObject("http://user-server/provider/user/get/" + id, User.class);
    }

    @Autowired
    private UserFeignService userFeignService;

    @RequestMapping("getFeign/{id}")
    public User getFeign(@PathVariable("id") Integer id) throws Exception {
        // 使用 Feign 封装的模板
        return this.userFeignService.get(id);
    }


}
