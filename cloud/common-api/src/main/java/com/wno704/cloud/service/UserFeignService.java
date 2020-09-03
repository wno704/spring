package com.wno704.cloud.service;

import com.wno704.cloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="USER-SERVER")
public interface UserFeignService {
    @RequestMapping("/provider/user/get/{id}")
    public User get(@PathVariable("id") Integer id);
}
