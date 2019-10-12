package com.zhiyou100.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhiyou100.model.User;

public interface UserMapper {

	int count(@Param("keyword")String keyword);

	List<User> findAll(Map<String, Object> map);

	void deleteUserById(int id);

	User updateUserById(int id);

	void updateUser(User user);

	void insertUser(User user);

	int deleteMulti(int i);

}
