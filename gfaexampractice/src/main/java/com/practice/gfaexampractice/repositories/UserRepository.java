package com.practice.gfaexampractice.repositories;

import com.practice.gfaexampractice.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}