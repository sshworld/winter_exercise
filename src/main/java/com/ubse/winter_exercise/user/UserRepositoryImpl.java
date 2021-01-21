package com.ubse.winter_exercise.user;

import com.ubse.winter_exercise.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.HashMap;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private final EntityManager em;

    @Autowired
    public UserRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Users save(HashMap<Object, String> map) {
        Users user = new Users();

        user.setUserId(map.get("userId"));
        user.setUserPw(map.get("userPw"));
        user.setUserNm(map.get("userNm"));
        user.setUserNick(map.get("userNick"));
        user.setGrade("normal");

        em.persist(user);

        return user;
    }
}
