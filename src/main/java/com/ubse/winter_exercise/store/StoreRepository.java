package com.ubse.winter_exercise.store;

import com.ubse.winter_exercise.domain.Stores;
import com.ubse.winter_exercise.domain.Users;

import java.util.HashMap;
import java.util.List;

public interface StoreRepository {
    List<Stores> findStore(String category);
}
