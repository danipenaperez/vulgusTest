package com.dppware.vulgus.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dppware.vulgus.models.User;

public interface UserRepository extends MongoRepository<User, String> {

    User findByEmail(String email);

}