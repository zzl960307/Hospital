package com.zhiyou100.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhiyou100.model.User;
import com.zhiyou100.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/list")
	public String findAll(HttpServletRequest req ,String keyword) {
		// 每页的字段数量
		int pageSize = 3;
		// 字段总数量
		int total = userService.count(keyword);
		// 当前页
		int pageNo = 0;
		String strPageNo = req.getParameter("pageNo");
		if(strPageNo == null || strPageNo =="") {
			pageNo = 1;
		}else {
			pageNo = Integer.parseInt(strPageNo);
		}
		// 页数总量
		int pages = total % pageSize == 0 ? total / pageSize : (total / pageSize) + 1;
		// 当前页从第几条字段开始
		int start = (pageNo - 1) * pageSize;
		// 当前页从第几条字段结束
		int end = pageSize;
		
		Map<String,Object> map = new HashMap<>();
		map.put("pageSize",pageSize );
		map.put("total",total );
		map.put("pageNo",pageNo );
		map.put("pages",pages );
		map.put("start", start);
		map.put("end",end);
		map.put("keyword",keyword );
		req.setAttribute("map", map);
		List<User> users = userService.findAll(map);
		req.setAttribute("users", users);
		return "User/list";
		
	}
	
	
	
	
	@RequestMapping("/delete")
	public String deleteUserById(int id) {
		userService.deleteUserById(id);
		return "forward:/user/list";
		
	}
	
	
	
	
	
	@RequestMapping(value=("/update"),method=RequestMethod.GET)
	public String updateUserById(int id,Model model) {
		User user = userService.updateUserById(id);
		model.addAttribute("user",user);
		return "User/editUser";
	}
	@RequestMapping(value=("/update"),method=RequestMethod.POST)
	public String updateUser(User user) {
		userService.updateUser(user);
		return "forward:/user/list";
		
	}
	
	
	
	
	
	@RequestMapping(value=("/insert"),method=RequestMethod.GET)
	public String insert() {
		return "User/addUser";
	}
	@RequestMapping(value=("/insert"),method=RequestMethod.POST)
	public String insertUser(User user) {
		userService.insertUser(user);
		
		return "forward:/user/list";
	}
	
	
	@RequestMapping("/deleteMulti")
	public String deleteMulti(int[] ids){
		for(int i = 0;i < ids.length; i++){
			int totals = userService.deleteMulti(ids[i]);
			System.out.println(totals);
		}
		return "forward:/user/list";
		
	}
	
	
	
	
	
	
	
	
	
	
}
