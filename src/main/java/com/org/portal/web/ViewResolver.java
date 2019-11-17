package com.org.portal.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ViewResolver {
	@GetMapping("/ang/{view}")
	public ModelAndView go(@PathVariable("view") final String view) {
		System.out.println("view===>"+view);
		return new ModelAndView(view);
	}

}
