package com.ubse.winter_exercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class MainController {

    @GetMapping("hello")
    @ResponseBody
    public HashMap<Object, String> hello(@RequestParam("name") String name) {

        HashMap<Object, String> map = new HashMap<>();

        map.put("string", name);

        return map;
    }

}
