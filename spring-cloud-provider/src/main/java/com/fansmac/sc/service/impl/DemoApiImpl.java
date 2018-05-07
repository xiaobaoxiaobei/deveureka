package com.fansmac.sc.service.impl;

import com.fansmac.sc.service.DemoApi;
import org.springframework.stereotype.Service;

@Service
public class DemoApiImpl implements DemoApi{

	@Override
	public String payment(long amount) {
		System.out.println("amount:"+amount);
		return String.valueOf(amount);
	}

	@Override
	public String echo(String content) {
		System.out.println("Service deal:"+content);
		return content;
	}

}
