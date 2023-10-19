package com.example.blogenboot.dao;

import com.example.blogenboot.ds.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDao extends JpaRepository<Post, Integer> {
}
