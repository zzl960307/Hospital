package com.zhiyou100.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhiyou100.model.Drug;

public interface DrugMapper {

	int count(@Param("keyword1")String keyword1,@Param("keyword2")String keyword2);

	List<Drug> findAll(Map<String, Object> map);

	Drug updateDrug(String drug_num);

	void updateById(Drug drug);

	Drug drugLookById(String drug_num);

	void insertDrug(Drug drug);


}
