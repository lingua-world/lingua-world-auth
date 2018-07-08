package com.linguaworld.auth.repository;

import com.linguaworld.auth.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface UserRepository extends CrudRepository<User, BigInteger> {
}
