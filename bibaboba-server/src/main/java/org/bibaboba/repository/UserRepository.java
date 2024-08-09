package org.bibaboba.repository;

import org.bibaboba.entity.Profile;
import org.bibaboba.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
}
