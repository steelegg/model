package com.fanchen.mapper;

import com.fanchen.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getUserById();
}
