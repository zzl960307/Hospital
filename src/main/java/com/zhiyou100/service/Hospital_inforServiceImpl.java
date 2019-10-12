package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.Hospital_inforMapper;
import com.zhiyou100.model.Hospital_infor;
@Service
public class Hospital_inforServiceImpl implements Hospital_inforService{
	@Autowired
	private Hospital_inforMapper mapper;

	@Override
	public int count(String keyword1) {
		return mapper.count(keyword1);
	}

	@Override
	public List<Hospital_infor> findAll(Map<String, Object> map) {
		return mapper.findAll(map);
	}

	@Override
	public List<Hospital_infor> insertFindAll(String medical_record) {
		
		return  mapper.insertFindAll(medical_record);
	}

	@Override
	public void insertHospital_infor(Hospital_infor hospital_infor) {
		mapper.insertHospital_infor(hospital_infor);
	}

	@Override
	public void deleteById(String[] ids) {
		for(int i = 0;i<ids.length;i++) {
			mapper.deleteById(ids[i]);
		}
	}

}
