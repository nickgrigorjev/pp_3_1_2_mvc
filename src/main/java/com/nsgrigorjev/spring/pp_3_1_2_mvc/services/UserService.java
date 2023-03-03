package com.nsgrigorjev.spring.pp_3_1_2_mvc.services;

import com.nsgrigorjev.spring.pp_3_1_2_mvc.models.User;

import java.util.List;


public interface UserService {

    List<User> getAllUsers();

    User show(int id);
    void create(User user);
    void update(User user);
    void delete(int id);

}
