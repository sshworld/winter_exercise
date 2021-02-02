package com.ubse.winter_exercise.store;

import com.ubse.winter_exercise.domain.Stores;
import com.ubse.winter_exercise.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    private final StoreRepository storeRepository;

    @Autowired
    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }


    @Override
    @Transactional
    public List<Stores> loadStore(String category) {

        return storeRepository.findStore(category);
    }
}
