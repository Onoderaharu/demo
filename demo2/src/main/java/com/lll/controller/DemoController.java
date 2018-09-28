package com.lll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("info")
	public String info(){
		string str="001";
		return "HelloWorld001";
	}
}
