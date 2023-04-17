package net.proselyte.IB_Site.service;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import net.proselyte.IB_Site.model.Role;
import net.proselyte.IB_Site.model.User;
import net.proselyte.IB_Site.repository.RoleRepository;
import net.proselyte.IB_Site.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public User getById(Long id) {
        log.info("In UserServiceImpl getById ()", id);
        return userRepository.getReferenceById(id);
    }

    @Override
    public void save(User user) {
        log.info("In UserServiceImpl save ()", user);
        Set<Role> roles = new HashSet<>();
        roles.add(roleRepository.getReferenceById(1L));
        user.setRoles(roles);
        userRepository.save(user);

    }

    @Override
    public void delete(Long id) {
        log.info("In UserServiceImpl delete()", id);
        userRepository.deleteById(id);
    }

    @Override
    public String getUserIpAddressById(Long id) {
        log.info("In UserServiceImpl getUserIpAddress()", id);
        return userRepository.findUsersIpById(id);
    }

    @Override
    public User findByIpAddress(String ipAddress) {
        log.info("In UserServiceImpl findByIpAddress()", ipAddress);
        return userRepository.findByIpAddress(ipAddress);
    }

    @Override
    public List<User> getAll() {
        log.info("In UserServiceImpl getAll ()");
        return userRepository.findAll();
    }
}
