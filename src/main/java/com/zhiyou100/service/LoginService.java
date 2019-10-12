package com.zhiyou100.service;

import com.zhiyou100.model.ResponseObject;
import com.zhiyou100.model.User;

public interface LoginService {

	User login(String user_name, String password);

	ResponseObject checkUser(String user_name);

	int registerAdd(User user);

	org.apache.catalina.User login(Object principal);


}