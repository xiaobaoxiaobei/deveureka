package com.fansmac.sc.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务提供者的API
 * @author Jason
 *
 */
//如果classpath中有Ribbon, 则查找name指定的服务的IP地址。如果Eureka也在classpath中，那么Ribbon会从Eureka的注册信息中查找。
@FeignClient(name = "spring-cloud-provider")
public interface IDemoApi {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String echo(@RequestParam("content")String content);
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String pay();
	
}
