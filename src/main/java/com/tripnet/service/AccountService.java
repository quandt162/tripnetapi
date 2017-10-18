package com.tripnet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripnet.dao.ICommonDAO;
import com.tripnet.entity.Account;

@Service
public class AccountService implements ICommonService<Account>{
	@Autowired
	private ICommonDAO<Account> commonDAO;
	
	@Override
	public Account getOneById(int accountId) {
		Account obj = commonDAO.getOneById(accountId);
		return obj;
	}
	
	@Override
	public List<Account> getAll() {
		return commonDAO.getAll();
	}	

	@Override
	public boolean add(Account account) {
		// TODO Auto-generated method stub
		return false;
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
