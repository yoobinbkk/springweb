package com.java.dao;

import java.util.HashMap;
import java.util.List;

import com.java.domain.EmpVO;

public interface EmpDAO {
	
	List<EmpVO> empSelect();
	
	List<HashMap> empDept();

}
