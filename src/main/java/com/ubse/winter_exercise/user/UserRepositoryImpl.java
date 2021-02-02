package com.ubse.winter_exercise.user;

import com.ubse.winter_exercise.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private final EntityManager em;

    @Autowired
    public UserRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    // 회원가입
    @Override
    public Users save(HashMap<String, Object> map) {
        Users user = new Users();
        user.setUserId(map.get("userId").toString());
        user.setUserPw(map.get("userPw").toString());
        user.setUserNm(map.get("userNm").toString());
        user.setUserNick(map.get("userNick").toString());
        user.setGrade("normal");

        em.persist(user);

        return user;
    }

    @Override
    public List<Users> findAll() {
        return em.createQuery("select u from users u", Users.class).getResultList();
    }

    // 로그인
    @Override
    public Users login(HashMap<String, Object> map) {

        Users users = em.find(Users.class, map.get("userId"));

        if(users.getUserPw().equals(map.get("userPw"))) {
            return users;
        }
        else {
            return null;
        }
    }
}
