package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import myclass.model.MemberVO;
import myclass.model.MemberVOList;

@Controller
public class ListController {
	
	@RequestMapping("multiInsert.do")
	public void test(MemberVOList memberVOList) {		// MemberVOList 리스트 형식으로
		
		/*
		for(MemberVO vo : memberVOList.getList()) {		// for문으로 풀어서 출력
			System.out.println(vo.isState() + ">" + vo.getId() + ":" + vo.getName() + "-" + vo.getAge());
		}
		*/
	}
	
}
