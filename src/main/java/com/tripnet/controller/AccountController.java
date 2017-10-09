package com.tripnet.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tripnet.entity.Account;
import com.tripnet.service.ICommonService;

@Controller
@RequestMapping("")
public class AccountController {
	@Autowired
	private ICommonService<Account> accountService;
	
	@GetMapping("account/{id}")
	public ResponseEntity<Account> getArticleById(@PathVariable("id") Integer id) {
		Account account = accountService.getOneById(id);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}
	
	@GetMapping("accounts")
	public ResponseEntity<List<Account>> getAllArticles() {
		List<Account> list = accountService.getAll();
		return new ResponseEntity<List<Account>>(list, HttpStatus.OK);
	}
}
