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

import com.zhiyou100.model.Hospital_infor;
import com.zhiyou100.service.Hospital_inforService;

@Controller
@RequestMapping("/hospital")
public class Hospital_inforController {
	@Autowired
	private Hospital_inforService hospital_inforService;
	
	@RequestMapping("/list")
	public String findAll(HttpServletRequest req,String keyword1) {
		int pageSize = 4;
		int total = hospital_inforService.count(keyword1);
		int pageNo = 0;
		String strPageNo = req.getParameter("pageNo");
		if(strPageNo==null || strPageNo == "") {
			pageNo = 1;
		}else {
			pageNo = Integer.parseInt(strPageNo);
		}
		int pages = total % pageSize == 0 ? total / pageSize : (total /pageSize) + 1;
		int start = (pageNo - 1) * pageSize;
		int end = pageSize;
		Map<String,Object> map = new HashMap<>();
		map.put("pageSize",pageSize );
		map.put("total",total );
		map.put("pageNo",pageNo );
		map.put("start",start );
		map.put("end",end );
		map.put("pages",pages );
		map.put("keyword1",keyword1 );
		req.setAttribute("map", map);
		List<Hospital_infor> hospitals = hospital_inforService.findAll(map);
		req.setAttribute("hospitals", hospitals);
		return "hospital/index";
	}
	
	
	
	
	
	
	
	@RequestMapping(value=("/insert"),method=RequestMethod.GET)
	public String insertFindAll(String medical_record,Model model) {
		List<Hospital_infor> hospital = hospital_inforService.insertFindAll(medical_record);
		model.addAttribute("hospital", hospital);
		System.out.println(hospital);
		return "hospital/add";
	}
	@RequestMapping(value=("/insert"),method=RequestMethod.POST)
	public String insertHospital_infor(Hospital_infor hospital_infor) {
		hospital_inforService.insertHospital_infor(hospital_infor);
		return "forward:/hospital/list";//==>这里为什么加上forward? 因为这里是通过跳转指定方法间接跳转对应页面,不是直接跳转页面
		
	}
	
	
	
	
	@RequestMapping("/delete")
	public String deleteById(String[] ids) {
		hospital_inforService.deleteById(ids);
		return "forward:/hospital/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
