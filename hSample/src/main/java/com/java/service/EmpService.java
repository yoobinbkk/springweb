package com.java.service;

import java.util.HashMap;
import java.util.List;

import com.java.domain.EmpVO;

public interface EmpService {
	
	List<EmpVO> empSelect();
	
	List<HashMap> empDept();

}
