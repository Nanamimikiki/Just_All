package net.proselyte.IB_Site.service;

import net.proselyte.IB_Site.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User getById(Long id);
    void save (User user);
    void delete(Long id);
    List<User> getAll();


}
