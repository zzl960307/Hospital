package com.zhiyou100.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.model.Registration_infor;
import com.zhiyou100.service.Registration_inforService;

@Controller
@RequestMapping("/ric")
public class Registration_inforController {
	@Autowired
	private Registration_inforService registration_inforService;
	@RequestMapping("/list")
	public String findAll(HttpServletRequest req,@RequestParam Map<String,Object> map,@RequestParam(defaultValue="1")int pageNo) {
		
		
	
		// 当前页和页面字段数 ==>开启pageHelper
		PageHelper.startPage(pageNo, 5);
		// 查询全部信息存入list
		List<Registration_infor> ris = registration_inforService.findAll(map);
		// 把信息存进页面然后对对页面进行操作
		PageInfo<Registration_infor> pageInfo = new PageInfo<>(ris);
		
		req.setAttribute("map", map);
		req.setAttribute("ris", pageInfo.getList());
		req.setAttribute("page", pageInfo);
		return "registration/index";
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value=("/look"),method=RequestMethod.GET)
	public String regLookById(HttpServletRequest req,String medical_record) {
		/*
		 * 先在list页面点击look,会执行get方法,跳转到look页面展示信息,然后form表单提交
		 * 点击详情出现信息说明是根据id出现的,返回的是id对应字段的内容,也就相当于查找一个用户
		 */
		// 通过id找到了对应的字段信息medical_record
		Registration_infor ri = registration_inforService.regLookById(medical_record);
		// 把信息发送到请求域
		req.setAttribute("ri", ri);
		// 跳转到look页面
		return "registration/look";
	}
	@RequestMapping(value=("/look"),method=RequestMethod.POST)
	public String returnLook() {
		return "forward:/ric/list";
	}
	
	
	
	
	
	
	
	@RequestMapping(value=("/insert"),method=RequestMethod.GET)
	public String insert() {
		return "registration/add";
	}
	@RequestMapping(value=("/insert"),method=RequestMethod.POST)
	public String insertRegistration_infor(Registration_infor registration_infor) {
		registration_inforService.insertRegistration_infor(registration_infor);
		return "forward:/ric/list";
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping("/delete")
	public String deleteRegistration_infor(String medical_record) {
		registration_inforService.deleteRegistration_infor(medical_record);
		System.out.println(medical_record);
		return "forward:/ric/list";
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value=("/update"),method=RequestMethod.GET)
	public String updateById(Model model,String medical_record) {
		Registration_infor ri = registration_inforService.updateById(medical_record);
		model.addAttribute("ri",ri);
		return "registration/edit";
	}
	@RequestMapping(value=("/update"),method=RequestMethod.POST)
	public String updateRegistration_infor(Registration_infor ri) {
		registration_inforService.updateRegistration_infor(ri);
		return "forward:/ric/list";
	}
	
	
	
	
	
	
	
	
}
