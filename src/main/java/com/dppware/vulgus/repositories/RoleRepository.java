package com.dppware.vulgus.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dppware.vulgus.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
