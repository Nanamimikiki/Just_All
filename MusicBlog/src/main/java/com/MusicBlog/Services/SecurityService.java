package com.MusicBlog.Services;

public interface SecurityService {
    String findLoggenInUsername();
    void autoLogin(String username, String password);
}
