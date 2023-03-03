package com.nsgrigorjev.spring.pp_3_1_2_mvc.services;

import com.nsgrigorjev.spring.pp_3_1_2_mvc.models.User;
import com.nsgrigorjev.spring.pp_3_1_2_mvc.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> getAllUsers(){
        return usersRepository.findAll();
    }
    public User show(int id){
        Optional<User> foundUser = usersRepository.findById(id);
        return foundUser.orElse(null);
    }
    public void create(User user){
        usersRepository.save(user);
    }
    public void update(User user){
        usersRepository.save(user);
    }
    public void delete(int id) {
        usersRepository.deleteById(id);
    }

}
