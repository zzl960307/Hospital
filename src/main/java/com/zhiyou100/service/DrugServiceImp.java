package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.DrugMapper;
import com.zhiyou100.model.Drug;

@Service
public class DrugServiceImp implements DrugService{
	@Autowired
	private DrugMapper mapper;

	@Override
	public int count(String keyword1, String keyword2) {
		return mapper.count(keyword1,keyword2);
	}

	@Override
	public List<Drug> findAll(Map<String, Object> map) {
		
		return mapper.findAll(map);
	}

	@Override
	public Drug updateDrug(String drug_num) {
		return mapper.updateDrug(drug_num);
	}

	@Override
	public void updateById(Drug drug) {
		mapper.updateById(drug);
	}

	@Override
	public Drug drugLookById(String drug_num) {
		
		return mapper.drugLookById(drug_num);
	}

	@Override
	public void insertDrug(Drug drug) {
		mapper.insertDrug(drug);
	}

	
}
