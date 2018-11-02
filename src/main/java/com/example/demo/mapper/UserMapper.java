package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2018-11-01
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> getUserInfoByName(String userName);

    void updateUserInfo(User user);
}
