package com.spring.codeblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.codeblog.model.Post;

@Repository
public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
