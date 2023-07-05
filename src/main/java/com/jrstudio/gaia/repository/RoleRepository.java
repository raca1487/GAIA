package com.jrstudio.gaia.repository;

import com.jrstudio.gaia.models.ERole;
import com.jrstudio.gaia.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}