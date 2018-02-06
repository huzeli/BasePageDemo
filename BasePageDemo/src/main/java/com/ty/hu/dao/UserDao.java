package com.ty.hu.dao;

import com.ty.hu.modal.User;
import org.springframework.stereotype.Repository;


import java.util.List;

public interface UserDao {
    public List<User> getUsers();
}

