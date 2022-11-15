package com.java.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.EmpDAO;
import com.java.domain.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDAO empDAO;

	public List<EmpVO> empSelect() {
		return empDAO.empSelect();
	}

	@Override
	public List<HashMap> empDept() {
		return empDAO.empDept();
	}

}
