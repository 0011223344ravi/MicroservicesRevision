package com.example.userservicerevision.service;

import com.example.userservicerevision.entity.User;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

  //  List<User> list = new ArrayList<>();

    List<User>  getAllUsers( ){
        List<User> list  = new ArrayList<>();
          list.add(new User(1311L,"baba","55545615451"));
          list.add(new User(1312L,"ravi","55545615451"));
          return list;
    }


    @Override
    public User getUser(Long id) {
       return  getAllUsers().stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}

