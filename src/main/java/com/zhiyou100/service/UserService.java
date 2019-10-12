package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.User;

public interface UserService {

	int count(String keyword);

	List<User> findAll(Map<String, Object> map);

	void deleteUserById(int id);

	User updateUserById(int id);

	void updateUser(User user);

	void insertUser(User user);

	int deleteMulti(int i);


}
