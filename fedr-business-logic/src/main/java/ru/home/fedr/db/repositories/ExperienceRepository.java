package ru.home.fedr.db.repositories;

import ru.home.fedr.db.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
