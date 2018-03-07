package com.fanchen.test;

import com.fanchen.mapper.UserMapper;
import com.fanchen.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void getUserById(){
        List<User> user=userMapper.getUserById();
        for (User i:user
             ) {
            System.out.println(i.toString());
        }
    }
}
