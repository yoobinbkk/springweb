package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import myclass.model.MemberVO;

@Controller
public class ParameterController {
	
	@RequestMapping({"param.do", "paramForm.do"})
	public ModelAndView test(MemberVO vo) {
		ModelAndView vs = new ModelAndView();
		vs.setViewName("parameter");
		return vs;
	}
	
}
