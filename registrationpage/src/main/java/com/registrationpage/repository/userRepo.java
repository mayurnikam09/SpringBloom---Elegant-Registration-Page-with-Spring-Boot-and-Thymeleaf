package com.registrationpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registrationpage.entity.User;

@Repository
public interface userRepo extends JpaRepository<User,Integer>{

}
