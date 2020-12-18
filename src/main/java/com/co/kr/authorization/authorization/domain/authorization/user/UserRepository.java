package com.co.kr.authorization.authorization.domain.authorization.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
//    List<User> findAllBy
}
