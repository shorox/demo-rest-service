package com.example.project.demo.repositories;

import java.util.Optional;

import com.example.project.demo.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
