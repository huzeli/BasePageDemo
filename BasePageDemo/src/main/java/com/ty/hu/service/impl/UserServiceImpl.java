package com.ty.hu.service.impl;

import com.ty.hu.dao.UserDao;
import com.ty.hu.modal.User;
import com.ty.hu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao mapper;

    public List<User> getUsers() {
        return mapper.getUsers();
    }
}
