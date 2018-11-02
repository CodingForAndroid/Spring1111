package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2018-11-01
 */
@Service
public abstract class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    /**
     * 添加数据
     */
    @Autowired
    UserMapper userMapper;
    @Override
    public void insertUserInfo(User user) {

        userMapper.insert(user);
    }

    /**
     * 查询数据
     * @param userName
     * @return
     */
    @Override
    public List<User> getUserInfoByName(String userName) {
        List<User> users = userMapper.getUserInfoByName(userName);
        return users;
    }

    @Override
    public void updateUserInfo(User user) {

        userMapper.updateUserInfo(user);
    }

    @Override
    public List<User> getUsersByPage(int current ,int size) {
        Page<User> page = new Page<>(current, size);
        IPage<User> userIPage = userMapper.selectPage(page, new QueryWrapper<User>().eq("age", 20));
//        Assert.assertSame(userIPage, page);
        System.out.println("总条数 ------> " + userIPage.getTotal());
        System.out.println("当前页数 ------> " + userIPage.getCurrent());
        System.out.println("当前每页显示数 ------> " + userIPage.getSize());
//        print(userIPage.getRecords());
        return  userIPage.getRecords();
    }
}
