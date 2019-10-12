package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.Registration_inforMapper;
import com.zhiyou100.model.Registration_infor;
@Service
public class Registration_inforServiceImpl implements Registration_inforService{
	@Autowired
	private Registration_inforMapper mapper;
	@Override
	public int count(Map<String, Object> map) {
		return mapper.count(map);
	}

	@Override
	public List<Registration_infor> findAll(Map<String, Object> map) {
		return mapper.findAll(map);
	}

	@Override
	public Registration_infor regLookById(String medical_record) {
		return mapper.regLookById(medical_record);
	}

	@Override
	public void insertRegistration_infor(Registration_infor registration_infor) {
		mapper.insertRegistration_infor(registration_infor);
	}

	@Override
	public void deleteRegistration_infor(String medical_record) {
		mapper.deleteRegistration_infor(medical_record);
	}

	@Override
	public Registration_infor updateById(String medical_record) {
		return mapper. updateById(medical_record);
	}

	@Override
	public void updateRegistration_infor(Registration_infor ri) {
		mapper.updateRegistration_infor(ri);
	}

}
