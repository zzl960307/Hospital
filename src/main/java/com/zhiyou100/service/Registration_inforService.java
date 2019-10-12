package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.Registration_infor;

public interface Registration_inforService {

	int count(Map<String, Object> map);

	List<Registration_infor> findAll(Map<String, Object> map);

	Registration_infor regLookById(String medical_record);

	void insertRegistration_infor(Registration_infor registration_infor);

	void deleteRegistration_infor(String medical_record);

	Registration_infor updateById(String medical_record);

	void updateRegistration_infor(Registration_infor ri);

	

}
