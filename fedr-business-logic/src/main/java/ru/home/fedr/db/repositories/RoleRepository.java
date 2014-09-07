package ru.home.fedr.db.repositories;

import ru.home.fedr.db.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
