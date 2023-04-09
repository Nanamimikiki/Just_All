package net.proselyte.IB_Site.repository;

import net.proselyte.IB_Site.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface for {@link User} class.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
