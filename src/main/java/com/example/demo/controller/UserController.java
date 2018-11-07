package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//CRUD
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    IUserService iUserService;

    @RequestMapping(value = "testController",method = RequestMethod.GET)
    public String testController(){

        return "testController";
    }
    /**
     * 注册 增（C）
     * @param user
     */
    @ResponseBody
    @PostMapping(value = "register")
    public void register(User user) {

        iUserService.insertUserInfo(user);
    }

    /**
     * 查询（R）
     * @param userName
     * @return
     */
    @ResponseBody
    @PostMapping(value = "getUsersByName")
    public List<User> getUserInfoByName(String userName){

        List<User> users = iUserService.getUserInfoByName(userName);
       return users;
    }

    /**
     * 更新（U）
     */
    @ResponseBody
    @PostMapping(value = "updateUserInfo")
    public void updateUserInfo(User user){
        iUserService.updateUserInfo(user);
    }

    /**
     * 分页查询（R）
     * @param current
     * @param size
     * @return
     */
    @ResponseBody
    @PostMapping(value = "getUsersByPage")
    public List<User>  getUsersByPage(int current,int size){
        List<User> users = iUserService.getUsersByPage( 2019, current , size);
        return users;
    }

    //删除（d）
    @ResponseBody
    @PostMapping(value = "unregister")
    public String unregister(String userid){

        iUserService.unregister(userid);

        return "unregister";
    }

}
