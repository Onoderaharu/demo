package com.lll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("info")
	public String info(){
		//return "HelloWorld002";
		return "HelloWorld001";
		
	}
}
