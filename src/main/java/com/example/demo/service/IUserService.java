package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2018-11-01
 */
public interface IUserService extends IService<User> {

    void insertUserInfo(User user);

    List<User> getUserInfoByName(String userName);

    void  updateUserInfo(User user);

    List<User> getUsersByPage(int age,long current ,int size);

   void  unregister(String userid);


}
