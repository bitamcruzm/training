package com.proteintracker;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Andrea Marcela Cruz Moreno, bridgingIT
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
