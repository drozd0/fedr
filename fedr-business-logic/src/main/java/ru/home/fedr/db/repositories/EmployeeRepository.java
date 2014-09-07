package ru.home.fedr.db.repositories;

import ru.home.fedr.db.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
