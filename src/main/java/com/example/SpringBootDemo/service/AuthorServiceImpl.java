package com.example.SpringBootDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootDemo.dao.AuthorDao;
import com.example.SpringBootDemo.domain.Author;

/**
 * jdbc连接service实现类
 * @author 杨云飞
 * @date 2018年9月30日
 */
@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
	@Autowired
    private AuthorDao authorDao;
 
    @Override
    public int add(Author author) {
        return this.authorDao.add(author);
    }
 
    @Override
    public int update(Author author) {
        return this.authorDao.update(author);      
    }
 
    @Override
    public int delete(Long id) {
        return this.authorDao.delete(id);
    }
 
    @Override
    public Author findAuthor(Long id) {
        return this.authorDao.findAuthor(id);
    }
 
    @Override
    public List<Author> findAuthorList() {
        return this.authorDao.findAuthorList();
    }
}
