package com.ubse.winter_exercise.user;

import com.ubse.winter_exercise.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public Users register(HashMap<String, Object> map) {

        return userRepository.save(map);
    }

    @Override
    @Transactional
    public List<Users> searchAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public Users login(HashMap<String, Object> map) {

        return userRepository.login(map);
    }
}
