package com.boot.dao;

import com.boot.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User select(@Param("id") int id);

    @Delete("DELETE FROM `tttt`.`user` WHERE `id` = #{id}")
    int delete(@Param("id") int id);

    int insert(User user);

    int update(User user);
}
