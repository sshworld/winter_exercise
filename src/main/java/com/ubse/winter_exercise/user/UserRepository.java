package com.ubse.winter_exercise.user;

import com.ubse.winter_exercise.domain.Users;

import java.util.HashMap;
import java.util.List;

public interface UserRepository {
    Users save(HashMap<String, Object> map);
    List<Users> findAll();
    Users login(HashMap<String, Object> map);

}
