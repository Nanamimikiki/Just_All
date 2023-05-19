package net.proselyte.IB_Site.service;

import lombok.extern.slf4j.Slf4j;
import net.proselyte.IB_Site.model.Role;
import net.proselyte.IB_Site.model.Status;
import net.proselyte.IB_Site.model.User;
import net.proselyte.IB_Site.repository.RoleRepository;
import net.proselyte.IB_Site.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Override
    public User register(User user) {
        log.info("In UserServiceImpl register ()", user);
        Role roleUser = roleRepository.findByName("ROLE_USER");
        Set<Role> roles = new HashSet<>();
        roles.add(roleUser);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(roles);
        user.setStatus(Status.ACTIVE);
        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        log.info("In UserServiceImpl getById ()", id);
        return userRepository.getReferenceById(id);
    }

    @Override
    public void delete(Long id) {
        log.info("In UserServiceImpl delete()", id);
        userRepository.deleteById(id);
    }

    @Override
    public User findByUserName(String username) {
        log.info("In UserServiceImpl findByUserName", username);
        return userRepository.findByUserName(username);
    }

    @Override
    public List<User> getAll() {
        log.info("In UserServiceImpl getAll ()");
        return userRepository.findAll();
    }
}
