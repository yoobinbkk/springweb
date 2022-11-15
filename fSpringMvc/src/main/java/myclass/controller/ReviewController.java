package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * 모델(데이터)를 뷰페이지로 전송
 * 
 * 1. ModelAndView
 * 		- addObject()
 * 2. Model (호출함수의 인자에 선언만 하기)
 * 		- setAttribute()
 */

@Controller
@RequestMapping("/review")
public class ReviewController {
	
	@RequestMapping("/modelandview.do")
	public ModelAndView test() {
		// 1. ModelAndView 뷰페이지 지정
		ModelAndView vw = new ModelAndView();
		vw.setViewName("review/void");
		vw.addObject("greeting", "오늘행복");
		vw.addObject("test", "테스트");
		return vw;
	}
	
	@RequestMapping("/string.do")
	// ***************************
	// Model : 뷰단으로 데이터를 전송 객체
	//		   ====> 인자에 지정
	public String test2(Model m) {
		// 2. 문자열 리턴 뷰페이지 지정
		m.addAttribute("greeting", "오늘행복");
		m.addAttribute("test", "테스트");
		return "review/void";
	}
	
	@RequestMapping("/void.do")
	public void test3(Model m) {
		// 3.void 리턴 뷰페이지 지정
		//	void면 requestMapping을 경로로 삼아서
		m.addAttribute("greeting", "오늘행복");
		m.addAttribute("test", "테스트");
	}
	
}
