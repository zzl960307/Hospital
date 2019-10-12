package com.zhiyou100.mapper;

import java.util.Map;


import com.zhiyou100.model.User;

public interface LoginMapper {

	User login(Map<String, String> map);

	User checkUser(String user_name);

	int registerAdd(User user);




}
