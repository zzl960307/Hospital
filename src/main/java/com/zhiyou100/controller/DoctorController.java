package com.zhiyou100.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
/*
 * controller 层面接收参数,对前端传进来的参数进行业务操作,导入service层面方法
 * service 层面进行业务处理,impl把service和mapper整合,也就是间接性对数据库进行操作
 * mapper 层面接口和xml配置文件名字必须一样,直接对数据库进行操作,具体实现在xml文件里
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.service.DoctorService;




@Controller//==> 相当于标签 <bean id="",class="">

@RequestMapping("/doc")
public class DoctorController {
	@Autowired // ==>属性注入,此接口下的属性 如果想标明具体哪个属性用@qualifier
	private DoctorService doctorService;
	
	
	/**
	 * 没利用工具的写法
	 * 
	 * @param req
	 * @param keyword
	 * @param keyword2
	 * @param keyword3
	 * @return
	 */
	
//	@RequestMapping("/list")
//	public String findAll(HttpServletRequest req,String keyword,String keyword2,String keyword3) {
//		// 分页
//		
//		// 每页的字段数量
//		int pageSize = 4;
//		// 字段总数量
//		int total = doctorService.count(keyword,keyword2,keyword3);
//		// 当前页
//		int pageNo = 0;
//		String strPageNo = req.getParameter("pageNo");
//		if(strPageNo == null || strPageNo =="") {
//			pageNo = 1;
//		}else {
//			pageNo = Integer.parseInt(strPageNo);
//		}
//		// 页数总量
//		int pages = total % pageSize == 0 ? total / pageSize : (total / pageSize) + 1;
//		// 当前页从第几条字段开始
//		int start = (pageNo - 1) * pageSize;
//		// 当前页从第几条字段结束
//		int end = pageSize;
//		
//		Map<String,Object> map = new HashMap<>();
//		map.put("pageSize",pageSize );
//		map.put("total",total );
//		map.put("pageNo",pageNo );
//		map.put("pages",pages );
//		map.put("start", start);
//		map.put("end",end);
//		map.put("keyword",keyword );
//		map.put("keyword2",keyword2 );
//		map.put("keyword3",keyword3 ); 
//		req.setAttribute("map", map);
//		
//		List<Doctor> doc = doctorService.findAllDoc(map);
//		req.setAttribute("doc", doc);
//		return "doctor/index";
//		
//	}
	
	/**
	 * 把关键字在MyBatis层用map接收的写法
	 */
	//HttpServletRequest req,@RequestParam Map<String,Object> map,@RequestParam(defaultValue="1") int pageNum
//	@RequestMapping("/list")
//	public String findAll(HttpServletRequest req,@RequestParam Map<String,Object> map) {
//		// 分页
//		
//		// 每页的字段数量
//		int pageSize = 4;
//		// 字段总数量
//		int total = doctorService.count(map);
//		// 当前页
//		int pageNo = 0;
//		String strPageNo = req.getParameter("pageNo");
//		if(strPageNo == null || strPageNo =="") {
//			pageNo = 1;
//		}else {
//			pageNo = Integer.parseInt(strPageNo);
//		}
//		// 页数总量
//		int pages = total % pageSize == 0 ? total / pageSize : (total / pageSize) + 1;
//		// 当前页从第几条字段开始
//		int start = (pageNo - 1) * pageSize;
//		// 当前页从第几条字段结束
//		int end = pageSize;
//		
//		map.put("pageSize",pageSize );
//		map.put("total",total );
//		map.put("pageNo",pageNo );
//		map.put("pages",pages );
//		map.put("start", start);
//		map.put("end",end);
//
//		req.setAttribute("map", map);
//		
//		List<Doctor> doc = doctorService.findAllDoc(map);
//		req.setAttribute("doc", doc);
//		return "doctor/index";
//		
//	}
	
	
	/**
	 * pageHelper写法
	 * @param req
	 * @param map
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/list")
	public String findAll(HttpServletRequest req,@RequestParam Map<String,Object> map,@RequestParam(defaultValue="1") int pageNum) {
		
		// 开启pageHelper
		PageHelper.startPage(pageNum,5);
		// 接受sql查询的全部信息
		List<Doctor> doc = doctorService.findAllDoc(map);
		// 分页时使用
		PageInfo<Doctor> pageInfo = new PageInfo<>(doc);
		
		req.setAttribute("map", map);
		req.setAttribute("doc", pageInfo.getList());
		req.setAttribute("pageInfo", pageInfo);
		return "doctor/index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value=("/look"),method=RequestMethod.GET)
	public String findLook(HttpServletRequest req,int id) {
		Doctor doc = doctorService.findLook(id);
		req.setAttribute("doc", doc);
		return "doctor/look"; //==>静态资源映射里面
		
	}
	@RequestMapping(value=("/look"),method=RequestMethod.POST)
	public String findReturn() {
		return "forward:/doc/list";
	}
	

	
	@RequestMapping("/delete")
	public String deleteDoctorById(int id) {
		doctorService.deleteDoctorById(id);
		return "forward:/doc/list"; //==> 不经过视图解析器
	}
	
	
	@RequestMapping(value=("/update"),method=RequestMethod.GET)
	public String update(int id,Model model) {
		Doctor doctor = doctorService.update(id);
		model.addAttribute("doc",doctor);
		return "doctor/edit";
	}
	@RequestMapping(value=("/update"),method=RequestMethod.POST)
	public String updateDoctorById(Doctor doctor) {
		doctorService.updateDoctorById(doctor);
		return "forward:/doc/list";
	}
	
	
	@RequestMapping(value=("/insert"),method=RequestMethod.GET)
	public String insert() {
		return "doctor/add";
	}
	@RequestMapping(value=("/insert"),method=RequestMethod.POST)
	public String insertDoctor(Doctor doctor) {
		doctorService.insertDoctor(doctor);
		return "forward:/doc/list";
	}
	
	
	
	
	
	/**
	 * 批量修改
	 */
	@RequestMapping(value=("/updateMulti"),method=RequestMethod.POST)
	public String updateMulti(int[] id){
		doctorService.updateMulti(id);
		return "forward:/doc/list";
	}
	
	
	
	
	
	
	
	
}
