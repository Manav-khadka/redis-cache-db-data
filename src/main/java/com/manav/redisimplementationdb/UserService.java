package com.manav.redisimplementationdb;

import java.util.List;
import org.springframework.stereotype.Service;


public interface UserService {
    public Users createUser(Users user);
    public Users getUser(int id);
    public Users updateUser(int id, Users user);
    public void deleteUser(int id);
    public List<Users> getUsers();
    public List<Users> addUsers(List<Users> users);
}
