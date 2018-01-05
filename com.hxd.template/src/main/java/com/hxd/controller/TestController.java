package com.hxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	//用来查看配置SpringMvc是否能成功运行
		@RequestMapping("/viewPage")
		public String test(){
			return "test";
		}
	
}
