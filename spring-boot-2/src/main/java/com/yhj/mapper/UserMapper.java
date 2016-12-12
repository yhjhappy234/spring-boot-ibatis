package com.yhj.mapper;

import com.yhj.pojo.User;
import com.yhj.provider.Userprovider;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * Created by YHJ on 2016/9/3.
 */
@Mapper
public interface UserMapper{

    @Insert("insert into user(username,password,nickname)" +
            "values(#{username},#{password},#{nickname})")
    int insert(User user);

    @SelectProvider(type = Userprovider.class,method = "find")
    List<User> find(User user);

    @UpdateProvider(type = Userprovider.class, method = "update")
    int update(User user);

    @Delete("delete from user where id = #{id}")
    int delete(Integer id);

}
