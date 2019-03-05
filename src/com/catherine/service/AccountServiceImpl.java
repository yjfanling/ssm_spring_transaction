package com.catherine.service;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.catherine.dao.AccountDao;

public class AccountServiceImpl implements AccountService {
	//账户dao
	private AccountDao ad;
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public void transferAccounts() {
		// TODO Auto-generated method stub
		//转帐逻辑
		
		//先从A账户扣款
		ad.subMoney(1,50d);
		//int a=1/0;
		//再给B账户加款
		ad.addMoney(2,50d);
	}

}
