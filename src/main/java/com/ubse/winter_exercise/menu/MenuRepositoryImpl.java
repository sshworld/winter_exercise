package com.ubse.winter_exercise.menu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ubse.winter_exercise.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class MenuRepositoryImpl implements MenuRepository{

    private final EntityManager em;

    @Autowired
    public MenuRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Menu> findMenu(int storeSeq) {

        return em.createQuery("select m from menu m where menuGroup.store.storeSeq = :storeSeq", Menu.class)
                .setParameter("storeSeq", storeSeq)
                .getResultList();
    }
}
