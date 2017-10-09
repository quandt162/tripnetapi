package com.tripnet.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tripnet.entity.Account;


@Transactional
@Repository
public class AccountDAO implements ICommonDAO<Account>{
	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public Account getOneById(int accountId) {
		return entityManager.find(Account.class, accountId);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAll() {
		String hql = "FROM Account";
		return (List<Account>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public void add(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int accountId) {
		// TODO Auto-generated method stub
		
	}

}
