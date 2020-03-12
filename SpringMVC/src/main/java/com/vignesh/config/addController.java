package com.vignesh.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addController {
	
	@RequestMapping("/addNumber")
	public ModelAndView addNumber(@RequestParam("num1") int t1,@RequestParam("num2") int t2 ) {
		
		int k=t1+t2;
		ModelAndView mv=new ModelAndView();
		mv.addObject("result",k);
		mv.setViewName("Welcome");
		return mv;
	}
}
