package com.java.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class SampleDAOImpl implements SampleDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public String getSample() {
		return mybatis.selectOne("SampleDAO.getSample");
	}

	
	

}
