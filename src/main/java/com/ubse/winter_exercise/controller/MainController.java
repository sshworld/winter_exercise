package com.ubse.winter_exercise.controller;

import com.ubse.winter_exercise.domain.Users;
import com.ubse.winter_exercise.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class MainController {

    private final UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("hello")
    @ResponseBody
    public HashMap<Object, String> hello(@RequestParam("name") String name) {

        HashMap<Object, String> map = new HashMap<>();

        map.put("string", name);

        return map;
    }

    @GetMapping("user")
    @ResponseBody
    public HashMap<String, Object> user() {

        List<Users> users = userService.searchAll();

        HashMap<String, Object> map = new HashMap<>();

        map.put("users", users);

        return map;
    }

    @PostMapping("register")
    @ResponseBody
    public Boolean register(@RequestParam HashMap<String, Object> userInfo) {

        Users users = userService.register(userInfo);

        if(users.getUserId() == userInfo.get("userId")) {
            return true;
        }
        else {
            return false;
        }
    }

    @PostMapping("login")
    @ResponseBody
    public Users login(@RequestParam HashMap<String, Object> userInfo) {

        return userService.login(userInfo);
    }

}
