package com.java.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.domain.EmpVO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSess;
	
	public List<EmpVO> empSelect() {
		return sqlSess.selectList("EmpDAO.empSelect");
	}

	@Override
	public List<HashMap> empDept() {
		return sqlSess.selectList("EmpDAO.empDept");
	}
	
}
