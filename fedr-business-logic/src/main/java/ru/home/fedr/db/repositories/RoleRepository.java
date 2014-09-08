package ru.home.fedr.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.fedr.db.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
