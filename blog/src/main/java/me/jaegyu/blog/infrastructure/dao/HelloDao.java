package me.jaegyu.blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import me.jaegyu.blog.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer> {
}
