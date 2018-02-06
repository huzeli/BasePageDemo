package com.ty.hu.controller.impl;

import com.ty.hu.controller.UserController;
import com.ty.hu.modal.User;
import com.ty.hu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Controller
public class UserControllerImpl implements UserController {
  @Autowired
  private UserService userService;
    @ResponseBody
    public Map<String, Object> getUsers() {
        Map<String,Object> map=new HashMap<String,Object>();
       List<User> users= userService.getUsers();
       map.put("users",users);
        return map;
    }
}
