package com.UST.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UST.api.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
