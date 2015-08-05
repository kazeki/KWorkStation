package com.kzk.kworkstation.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	Log log= LogFactory.getLog(IndexController.class);

	@RequestMapping("/index")
	public  void index(){
		log.debug("/index debug");
		log.info("/index info");
		log.error("/index error");
		log.warn("/index warn");
	}
	
	public String name="name";
	private String address="address";
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String log(IndexController indexController ){
		return indexController.getAddress();
	}
	
	public String hello(String msg ){
		return "hello "+ msg;
	}
}
