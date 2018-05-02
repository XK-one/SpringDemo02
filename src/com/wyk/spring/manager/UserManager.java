package com.wyk.spring.manager;

public interface UserManager {

     void addUser(String name,String password);  
     void delUser(int userId);  
     String findUserById(int userId);  
     void modifyUser(int userId,String username,String password);  
}
