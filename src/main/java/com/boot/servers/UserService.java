package com.boot.servers;

import com.boot.pojo.User;

public interface UserService {
    public User select(int id);

    public int delete() throws Exception;

    public int update(User user);

    public int add(User user);
}
