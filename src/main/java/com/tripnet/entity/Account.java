package com.tripnet.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Account_ID")
	private int accountId;
	@Column(name = "Account_Email")
	private String accountEmail;
	@Column(name = "Account_Password")
	private String accountPassword;
	@Column(name = "Role_ID")
	private String roleId;
	@Column(name = "Account_Status")
	private String accountStatus;
	@Column(name = "Account_Create_Date")
	private String accountCreateDate;
	
	public int getAccountId() {
		return accountId;
	}
	
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public String getAccountEmail() {
		return accountEmail;
	}
	
	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}
	
	public String getAccountPassword() {
		return accountPassword;
	}
	
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	public String getRoleId() {
		return roleId;
	}
	
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
	public String getAccountStatus() {
		return accountStatus;
	}
	
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	public String getAccountCreateDate() {
		return accountCreateDate;
	}
	
	public void setAccountCreateDate(String accountCreateDate) {
		this.accountCreateDate = accountCreateDate;
	}

}
