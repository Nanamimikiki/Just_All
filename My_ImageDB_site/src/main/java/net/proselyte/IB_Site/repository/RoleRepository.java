package net.proselyte.IB_Site.repository;

import net.proselyte.IB_Site.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Interface for {@link Role} class.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
