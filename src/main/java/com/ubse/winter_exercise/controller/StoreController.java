package com.ubse.winter_exercise.controller;

import com.ubse.winter_exercise.domain.Menu;
import com.ubse.winter_exercise.domain.Stores;
import com.ubse.winter_exercise.menu.MenuService;
import com.ubse.winter_exercise.store.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("store")
public class StoreController {

    private final StoreService storeService;
    private final MenuService menuService;

    @Autowired
    public StoreController(StoreService storeService, MenuService menuService) {
        this.storeService = storeService;
        this.menuService = menuService;
    }

    @GetMapping("find")
    @ResponseBody
    public List<Stores> findStore(@RequestParam("category") String category) {

        return storeService.loadStore(category);
    }

    @GetMapping("menu")
    @ResponseBody
    public List<Menu> findMenu(@RequestParam("storeSeq") int storeSeq) {

        return menuService.findMenu(storeSeq);
    }
}
