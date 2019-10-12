package com.zhiyou100.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhiyou100.model.Hospital_infor;

public interface Hospital_inforMapper {

	int count(@Param("keyword1")String keyword1);

	List<Hospital_infor> findAll(Map<String, Object> map);

	List<Hospital_infor> insertFindAll(String medical_record);

	void insertHospital_infor(Hospital_infor hospital_infor);

	void deleteById(String ids);

}
