package com.catherine.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void subMoney(Integer id, Double money) {
		// TODO Auto-generated method stub
		String sql="update account set money=money-? where id=?"; 
		getJdbcTemplate().update(sql,money,id);
	}

	@Override
	public void addMoney(Integer id, Double money) {
		// TODO Auto-generated method stub
		String sql="update account set money=money+? where id=?"; 
		getJdbcTemplate().update(sql,money,id);
	}

}
