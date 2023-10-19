package com.example.blogenboot.dao;

import com.example.blogenboot.ds.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
