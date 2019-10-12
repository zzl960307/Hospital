package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.DoctorMapper;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.Section;
@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	private DoctorMapper mapper;
//	@Override
//	public int count(String keyword, String keyword2, String keyword3) {
//		return mapper.count(keyword,keyword2,keyword3);
//	}
	
	
//	@Override
//	public int count(Map<String, Object> map) {
//		return mapper.count(map);
//	}

	@Override
	public List<Doctor> findAllDoc(Map<String, Object> map) {
		return mapper.findAllDoc(map);
	}

	@Override
	public List<Section> findAllSec(Map<String, Object> map) {
		return mapper.findAllSec(map);
	}


	@Override
	public Doctor findLook(int id) {
		return mapper.findLook(id);
	}

	@Override
	public void deleteDoctorById(int id) {
		mapper.deleteDoctorById(id);
	}

	@Override
	public Doctor update(int id) {
		return mapper.update(id);
	}

	@Override
	public void updateDoctorById(Doctor doctor) {
		mapper.updateDoctorById(doctor);
	}

	@Override
	public void insertDoctor(Doctor doctor) {
		mapper.insertDoctor(doctor);
	}

	@Override
	public void updateMulti(int[] id) {
		for(int i = 0; i < id.length; i++){
			mapper.updateMulti(id[i]);
		}
	}




}
