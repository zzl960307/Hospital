package com.zhiyou100.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.model.ResponseObject;
import com.zhiyou100.model.User;
import com.zhiyou100.service.LoginService;
@Controller
@RequestMapping("/user")
public class UserLogin {
	/*
	 *  controller层面负责接收参数,页面跳转.
	 *  也就是从前端接收来的参数进行业务操作,返回一个指定的路径或者数据表
	 */
	@Autowired
	private LoginService loginService;
	@RequestMapping(value=("/login"),method=RequestMethod.POST)
	public String login(String user_name,String password,HttpServletRequest req) {
		User user = loginService.login(user_name,password);
		HttpSession session = req.getSession();
		if(user != null && user.getPassword().equals(password)) {
			session.setAttribute("user", user);
			return "index";
		}else{
			req.setAttribute("msg", "用户名或者密码错误");
			return "forward:/login.jsp";
		}
	}
	
	
	@RequestMapping(value=("/login"),method=RequestMethod.GET)
	public String login(HttpServletRequest req){
		//从请求域里获得session然后销毁session,从定向到登录页面
		req.getSession().invalidate();
		return "redirect:/login.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/check")
	@ResponseBody
	public ResponseObject checkUser(String user_name){
		ResponseObject ro = loginService.checkUser(user_name); 
		return ro;
	}
	
	@RequestMapping(value=("/register"),method=RequestMethod.GET)
	public String register(){
		return "forward:/register.jsp";
	}
	
	@RequestMapping(value=("/register"),method=RequestMethod.POST)
	public String registerAdd(User user){
		int i = loginService.registerAdd(user);
		if(i>0){
			return "forward:/login.jsp";
		}
		return "redirect:/register.jsp";
		
	}
	
	
	
	
	
}
