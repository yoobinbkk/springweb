package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.service.SampleService;

@Controller
public class SampleController {
	
	@Autowired
	private SampleService sampleService;

	@RequestMapping("sample.do")
	public String test(Model m) {
		m.addAttribute("serverTime", sampleService.getSample());
		return "home";
	}
	
}
