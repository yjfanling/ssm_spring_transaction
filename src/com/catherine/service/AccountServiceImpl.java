package com.catherine.service;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.catherine.dao.AccountDao;

public class AccountServiceImpl implements AccountService {
	//�˻�dao
	private AccountDao ad;
	public void setAd(AccountDao ad) {
		this.ad = ad;
	}
	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public void transferAccounts() {
		// TODO Auto-generated method stub
		//ת���߼�
		
		//�ȴ�A�˻��ۿ�
		ad.subMoney(1,50d);
		//int a=1/0;
		//�ٸ�B�˻��ӿ�
		ad.addMoney(2,50d);
	}

}
