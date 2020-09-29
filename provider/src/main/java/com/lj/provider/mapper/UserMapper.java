package com.lj.provider.mapper;
import com.lj.common.domin.User;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface  UserMapper {
    @Results(id="userMap",value = {
            @Result(column = "id",property="id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),
            @Result(column = "sex",property = "sex")})
    @Select("select * from user")
    List<User> getAll();


    @Select("SELECT * FROM user t WHERE t.id = #{id}")
    @ResultMap("userMap")
    User getOne(int id);


}
