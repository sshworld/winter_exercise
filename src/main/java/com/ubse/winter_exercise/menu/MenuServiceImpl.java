package com.ubse.winter_exercise.menu;

import com.ubse.winter_exercise.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Menu> findMenu(int storeSeq) {

        return menuRepository.findMenu(storeSeq);
    }
}
