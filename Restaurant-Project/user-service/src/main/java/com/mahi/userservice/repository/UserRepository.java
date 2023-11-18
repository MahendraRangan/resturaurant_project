package com.mahi.userservice.repository;

import com.mahi.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    User findUserByuserId(Long userId);
}
