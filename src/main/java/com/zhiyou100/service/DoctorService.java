package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.Section;

public interface DoctorService {
// 使用关键字方法
//	int count(String keyword, String keyword2, String keyword3);

	// 不使用关键字,直接用map接收
//	int count(Map<String, Object> map);

	List<Doctor> findAllDoc(Map<String, Object> map);
	
	List<Section> findAllSec(Map<String, Object> map);
	
	Doctor findLook(int id);
	
	void deleteDoctorById(int id);
	
	Doctor update(int id);
	
	void updateDoctorById(Doctor doctor);
	
	void insertDoctor(Doctor doctor);

	void updateMulti(int[] id);


}
