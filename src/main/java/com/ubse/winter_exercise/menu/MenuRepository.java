package com.ubse.winter_exercise.menu;

import com.ubse.winter_exercise.domain.Menu;

import java.util.List;

public interface MenuRepository {

    List<Menu> findMenu(int storeSeq);
}
