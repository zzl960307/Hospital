package com.zhiyou100.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.Section;

public interface DoctorMapper {

//	int count(@Param("keyword")String keyword,@Param("keyword2")String keyword2, @Param("keyword3")String keyword3);
//	int count(Map<String, Object> map);


	List<Doctor> findAllDoc(Map<String, Object> map);

	List<Section> findAllSec(Map<String, Object> map);

	Doctor findLook(int id);

	void deleteDoctorById(int id);


	Doctor update(int id);


	void updateDoctorById(Doctor doctor);


	void insertDoctor(Doctor doctor);

	void updateMulti(int i);



}
