package com.web.Mapper;

import com.web.Domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public void insert(User user);
}
