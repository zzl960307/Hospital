package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.Drug;

public interface DrugService {

	int count(String keyword1, String keyword2);

	List<Drug> findAll(Map<String, Object> map);

	Drug updateDrug(String drug_num);

	void updateById(Drug drug);

	Drug drugLookById(String drug_num);

	void insertDrug(Drug drug);


}
