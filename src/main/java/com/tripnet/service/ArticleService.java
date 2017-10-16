package com.tripnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripnet.dao.ArticleDAO;
import com.tripnet.dao.ICommonDAO;
import com.tripnet.entity.Article;

@Service
public class ArticleService implements ICommonService<Article> {
	@Autowired
	private ICommonDAO<Article> articleDAO;
	
	@Override
	public Article getOneById(int articleId) {
		Article obj = articleDAO.getOneById(articleId);
		return obj;
	}	
	
	@Override
	public List<Article> getAll(){
		return articleDAO.getAll();
	}
	
	@Override
	public synchronized boolean add(Article article){
       if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
    	   return false;
       } else {
    	   articleDAO.add(article);
    	   return true;
       }
	}
	
	@Override
	public void update(Article article) {
		articleDAO.update(article);
	}
	
	@Override
	public void delete(int articleId) {
		articleDAO.delete(articleId);
	}
}
