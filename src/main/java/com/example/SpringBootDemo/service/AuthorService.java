package com.example.SpringBootDemo.service;

import java.util.List;

import com.example.SpringBootDemo.domain.Author;

public interface AuthorService {
	int add(Author author);
    int update(Author author);
    int delete(Long id);
    Author findAuthor(Long id);
    List<Author> findAuthorList();
}
