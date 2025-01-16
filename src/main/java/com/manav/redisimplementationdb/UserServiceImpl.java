package com.manav.redisimplementationdb;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public Users createUser(Users user) {
        return null;
    }
    public List<Users> addUsers(List<Users> users) {
        log.atInfo().log("Adding users to the database"+ users);
        return userRepository.saveAll(users);
    }

    @Override
    public Users getUser(int id) {
        return null;
    }

    @Override
    public Users updateUser(int id, Users user) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    @Cacheable(value = "Users")
    public List<Users> getUsers() {
        return userRepository.findAll();
    }
}
