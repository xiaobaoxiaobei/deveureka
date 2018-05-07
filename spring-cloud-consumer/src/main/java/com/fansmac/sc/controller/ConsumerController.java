package com.fansmac.sc.controller;

import com.fansmac.sc.service.IDemoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired
	IDemoApi iDemoApi;
	
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String consuemrEchoMethod(String content) {
		String msg=iDemoApi.echo(content);
		System.out.println("#######ctt:"+msg);
		return msg;
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String consuemrPay() {
		String msg=iDemoApi.pay();
		System.out.println("#######pay:"+msg);
		return msg;
		
	}

}
