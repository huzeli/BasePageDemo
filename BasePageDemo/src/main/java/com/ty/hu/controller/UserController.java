package com.ty.hu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;
@RequestMapping("user")
public interface UserController {

    @RequestMapping("/getUsers")
    public Map<String,Object> getUsers();
}
