package net.proselyte.IB_Site.service;

import jakarta.servlet.http.HttpServletRequest;
import net.proselyte.IB_Site.model.User;
import java.util.List;

public interface UserService {
    User getById(Long id);
    void save (User user);
    void delete(Long id);
    public String getUserIpAddressById(Long id);
    User findByIpAddress(String ipAddress);
    List<User> getAll();


}
