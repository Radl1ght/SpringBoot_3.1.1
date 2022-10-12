package ru.javamentor.SpringBoot_311.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.javamentor.SpringBoot_311.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
