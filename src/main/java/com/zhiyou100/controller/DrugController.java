package com.zhiyou100.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zhiyou100.model.Drug;
import com.zhiyou100.service.DrugService;

@Controller
@RequestMapping("/drug")
public class DrugController {
	@Autowired
	private DrugService drugService;
	@RequestMapping("/list")
	public String findAll(HttpServletRequest req,String keyword1,String keyword2){
		int pageSize = 5;
		int total = drugService.count(keyword1,keyword2);
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
		map.put("keyword2",keyword2 );
		req.setAttribute("map", map);
		List<Drug> drugs = drugService.findAll(map);
		req.setAttribute("drugs", drugs);
		return "medicine/index";
	}
	
	
	
	
	
	@RequestMapping(value=("/look"),method=RequestMethod.GET)
	public String drugLookById(String drug_num,Model model) {
		Drug drug = drugService.drugLookById(drug_num);
		model.addAttribute("drug",drug);
		System.out.println(drug.getDrug_url());
		return "medicine/look";
	}
	@RequestMapping(value=("/look"),method=RequestMethod.POST)
	public String returnDrug() {
		return "forward:/drug/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value=("/update"),method=RequestMethod.POST)
	public String updateById(@RequestParam("img")MultipartFile img,HttpServletRequest req,Drug drug) throws IOException {
		String realPath = "D:\\WorkSpace\\Hospital\\src\\main\\webapp\\WEB-INF\\img";
		File file = new File(realPath);
		if(file.exists()) {
			file.mkdir();
		}
		String oldFilename = img.getOriginalFilename();// 得到原始文件
		String[] split = oldFilename.split("\\.");
		long prefix = new Date().getTime();
		String suffix = split[split.length-1];
		String newFilename = prefix+"."+suffix;
		File newFile = new File(file,newFilename);
		FileUtils.writeByteArrayToFile(newFile, img.getBytes());
		req.setAttribute("path", "/img/"+newFilename);
		drug.setDrug_url(newFilename);
		drugService.updateById(drug);
		return "forward:/drug/list";
	}
	
	@RequestMapping(value=("/update"),method=RequestMethod.GET)
	public String updateDrug(String drug_num,HttpServletRequest req){
		Drug drug = drugService.updateDrug(drug_num);
		req.setAttribute("drug",drug);
		
		return "medicine/edit";
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value=("/insert"),method=RequestMethod.GET)
	public String insert() {
		return "medicine/add";
	}
	@RequestMapping(value=("/insert"),method=RequestMethod.POST)
	public String insertDoctor(@RequestParam("img")MultipartFile img,Drug drug,HttpServletRequest req) throws IOException {
		String realPath = "D:\\WorkSpace\\Hospital\\src\\main\\webapp\\WEB-INF\\img";
		File file = new File(realPath);
		if(file.exists()) {
			file.mkdir();
		}
		String oldFilename = img.getOriginalFilename();// 得到原始文件
		String[] split = oldFilename.split("\\.");
		long prefix = new Date().getTime();
		String suffix = split[split.length-1];
		String newFilename = prefix+"."+suffix;
		File newFile = new File(file,newFilename);
		FileUtils.writeByteArrayToFile(newFile, img.getBytes());
		req.setAttribute("path", "/img/"+newFilename);
		drug.setDrug_url(newFilename);
		drugService.insertDrug(drug);
		return "forward:/drug/list";
	}
//	public String insertMedicine(@RequestParam("img")MultipartFile img,Drug drug,HttpServletRequest req) throws IOException{
//		/*
//		 * 上传文件 上传至服务器中当前项目下(getServletContext().getRealPath("文件夹名"))
//		 * 1.先写指定路径,也就是图片的所在位置
//		 * 2.在指定路径创建一个文件夹
//		 * 3.用判断语句,如果这个文件夹存在就不创建,不存在就创建
//		 * 4.获取原始文件名,也就是上传文件时候的文件名
//		 * 5.对原始文件名进行分割,防止重名,从 . 开始分割 前缀换成用当前毫秒值代替,后缀不变.
//		 * 6.确定上传路径
//		 * 7.上传,将字节数组写入文件
//		 * 8.存进请求域
//		 */
//		String realPath = "D:\\WorkSpace\\Hospital\\src\\main\\webapp\\WEB-INF\\img";
//		File file = new File(realPath);
//		if(file.exists()){
//			file.mkdir();
//		}
//		String originalFilename = img.getOriginalFilename();
//		String[] split = originalFilename.split("\\.");
//		String suffix = split[originalFilename.length()-1];
//		long prefix = new Date().getTime();
//		String newFileName = prefix + "." + suffix;
//		File newFile = new File(file,newFileName);
//		FileUtils.writeByteArrayToFile(newFile, img.getBytes());
//		req.setAttribute("path", "/img/"+newFileName);
//		return "forward:/drug/list";
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
