package com.lll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("info")
	public String info(){
		System.out.println("001");
		String str="001";
		return "HelloWorld001";
	}
}
