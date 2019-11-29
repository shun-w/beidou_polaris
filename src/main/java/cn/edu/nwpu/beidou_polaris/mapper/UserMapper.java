package cn.edu.nwpu.beidou_polaris.mapper;

import cn.edu.nwpu.beidou_polaris.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserMapper {
    @Select("select * from `user` where username= #{username} and password=#{password} and is_active=1")
    User login(@Param("username") String username, @Param("password") String password);

    @Select("select * from user where username = #{username}")
    User findUserByUsername(@Param("username") String username);
}
