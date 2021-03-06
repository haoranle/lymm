package com.lymm.impl;

import com.lymm.dao.UsersDAO;
import com.lymm.domian.Users;

import java.util.List;

/**
 * Created by ${Seek} on 2017/3/27
 */
public class UsersDAOImpl extends BaseDAO<Users> implements UsersDAO {
	@Override
	public Users getUsers(String name,String password) {
		String sql = "SELECT * FROM users WHERE name = ? & password = ?";
		return query(sql, name,password);
	}

	@Override
	public List<Users> getUsersByList() {
		String sql = "SELECT * FROM users";
		return queryForList(sql, null);
	}

	@Override
	public void addUsers(Users users) {
		//insert into users(trueName,number,phone,address)values(?,?,?,?)

		String sql = "INSERT INTO users(trueName,number,phone,address) VALUES(?,?,?,?)";
		update(sql, users.getTrueName(), users.getNumber(), users.getPhone(), users.getAddress());
	}
}
