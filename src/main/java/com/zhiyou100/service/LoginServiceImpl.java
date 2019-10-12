package com.zhiyou100.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.LoginMapper;
import com.zhiyou100.model.ResponseObject;
import com.zhiyou100.model.User;
/*
 * service层面进行业务处理,把controller和Service进行融合,
 * 导入mapper层面方法,间接对数据库进行操作
 */
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginMapper mapper;

	@Override
	public User login(String user_name, String password) {
		Map<String,String> map = new HashMap<>();
		map.put("user_name", user_name);
		map.put("password", password);
		User user = mapper.login(map);
		return user;
	}

	@Override
	public ResponseObject checkUser(String user_name) {
		User user = mapper.checkUser(user_name);
		System.out.println("接收"+user);
		ResponseObject ro = new ResponseObject();
		if(user != null){
			ro.setCode("404");
			ro.setMsg("不可以注册");
		}else{
			ro.setCode("200");
			ro.setMsg("可以注册");
		}
		return ro;
	}

	@Override
	public int registerAdd(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public org.apache.catalina.User login(Object principal) {
		// TODO Auto-generated method stub
		return null;
	}




	
}
