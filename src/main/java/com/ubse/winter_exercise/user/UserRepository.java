package com.ubse.winter_exercise.user;

import com.ubse.winter_exercise.domain.Users;

import java.util.HashMap;

public interface UserRepository {
    Users save(HashMap<Object, String> map);

}
