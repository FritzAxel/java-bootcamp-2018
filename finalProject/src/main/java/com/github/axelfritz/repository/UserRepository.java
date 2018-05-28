package com.github.axelfritz.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.axelfritz.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	Optional<User> findById(Long userId);
	User findByEmail(String email);
	User findByNickName(String nickName);
}
