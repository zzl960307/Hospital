package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.Hospital_infor;

public interface Hospital_inforService {

	int count(String keyword1);

	List<Hospital_infor> findAll(Map<String, Object> map);

	List<Hospital_infor> insertFindAll(String medical_record);

	void insertHospital_infor(Hospital_infor hospital_infor);

	void deleteById(String[] ids);


}
