package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.smart.entities.user;

public interface UserRepository extends JpaRepository<user,Integer>{

}
