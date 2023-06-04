package com.MusicBlog.Services;

import com.MusicBlog.model.User;

public interface UserService {
    void save(User user);
    User findByUsernamee(String username);
}
