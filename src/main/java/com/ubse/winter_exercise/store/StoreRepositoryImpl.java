package com.ubse.winter_exercise.store;

import com.ubse.winter_exercise.domain.Category;
import com.ubse.winter_exercise.domain.Stores;
import com.ubse.winter_exercise.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;

@Repository
public class StoreRepositoryImpl implements StoreRepository {

    private final EntityManager em;

    @Autowired
    public StoreRepositoryImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<Stores> findStore(String category) {

        List<Stores> result = em.createQuery("select s from stores s where category.categoryNm =: category", Stores.class)
                .setParameter("category", category)
                .getResultList();

        return result;
    }
}
