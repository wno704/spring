package com.wno704.boot;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wno704.boot.mapper.PersonMapper;
import com.wno704.boot.mapper.UserMapper;
import com.wno704.boot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = MapperPageHelperApplication.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperPageHelperApplicationTests {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private UserMapper userService;

    @Test
    public void test() throws Exception {

        PageHelper.startPage(2, 2);
        List<User> list = this.userService.selectAll();
        PageInfo<User> pageInfo = new PageInfo<User>(list);
        List<User> result = pageInfo.getList();
        for (User u : result) {
            System.out.println(u.getUsername());
        }
        System.out.println(pageInfo.getList().toString());
    }

}
