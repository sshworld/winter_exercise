package com.ubse.winter_exercise.user;

import com.ubse.winter_exercise.domain.Users;

import java.util.HashMap;
import java.util.List;

public interface UserService {
   Users register(HashMap<String, Object> map);
   List<Users> searchAll();
   Users login(HashMap<String, Object> map);
}
