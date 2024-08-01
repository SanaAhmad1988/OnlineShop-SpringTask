package com.OnlineShopping;


import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> userMap = new HashMap<>();

    public void createUser(User user) {
        userMap.put(user.getId(), user);
    }

    public User getUser(String id) {
        return userMap.get(id);
    }

    public void updateUser(User user) {
        userMap.put(user.getId(), user);
    }

    public void deleteUser(String id) {
        userMap.remove(id);
    }
}
