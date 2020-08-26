package com.wno704.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wno704.boot.model.User;
import com.wno704.boot.service.PersonService;
import com.wno704.boot.service.UserService;

@RestController
public class TestController {
	
	@Autowired
    private PersonService personService;
	
	@Autowired
    private UserService userService;
	
	@RequestMapping( value = "/queryperson", method = RequestMethod.GET)
    public String queryStudentBySno() {
        return this.personService.selectAll().toString();
    }
	
	@RequestMapping( value = "/queryuser", method = RequestMethod.GET)
    public String queryUser() {
        return this.userService.selectAll().toString();
    }
	
	
	@RequestMapping( value = "/queryuserpage", method = RequestMethod.GET)
    public String queryUserPage() {
        
        
        PageHelper.startPage(2, 2);
        List<User> list = this.userService.selectAll();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        List<User> result = pageInfo.getList();
        for (User u : result) {
            System.out.println(u.getUsername());
        }
        
        return pageInfo.getList().toString();
    }
	
}
