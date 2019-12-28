package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Article;



public interface AdminDao extends JpaRepository<Article, Long> {

	List<Article> findByTitle(String title);
	Optional<Article> findById(Long id);
	Page<Article> finByTitle(String title,Pageable p);
	Page<Article> findAll(Pageable p);
	
}
