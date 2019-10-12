package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.UserMapper;
import com.zhiyou100.model.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper mapper;

	@Override
	public int count(String keyword) {
		
		return mapper.count(keyword);
	}

	@Override
	public List<User> findAll(Map<String, Object> map) {
		return mapper.findAll(map);
	}

	@Override
	public void deleteUserById(int id) {
		mapper.deleteUserById(id);
	}

	@Override
	public User updateUserById(int id) {
		User user = mapper.updateUserById(id);
		return user;
	}

	@Override
	public void updateUser(User user) {
		mapper.updateUser(user);
	}

	@Override
	public void insertUser(User user) {
		mapper.insertUser(user);
		
	}

	@Override
	public int deleteMulti(int i) {
		return mapper.deleteMulti(i);
	}
}
