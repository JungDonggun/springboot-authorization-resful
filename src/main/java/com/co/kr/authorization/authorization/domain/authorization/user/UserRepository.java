package com.co.kr.authorization.authorization.domain.authorization.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAllByNickname(String identity);
}
