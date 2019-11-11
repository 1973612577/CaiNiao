package com.exampley.demorr.dao;

import com.exampley.demorr.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginAndRegisterMapper {
    @Insert("insert into user(number,name,phone,password) values(#{number},#{name},#{phone},#{password})")
    Integer insert(User user);
}
