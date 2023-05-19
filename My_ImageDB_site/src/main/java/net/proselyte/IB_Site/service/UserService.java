package net.proselyte.IB_Site.service;

import net.proselyte.IB_Site.model.User;
import java.util.List;

public interface UserService {
    User register (User user);
    User findById(Long id);
    void delete(Long id);
    User findByUserName(String username);
    List<User> getAll();
}
