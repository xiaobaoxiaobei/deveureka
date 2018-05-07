
package com.fansmac.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fansmac.sc.service.DemoApi;

@RestController
public class ProviderController {

    @Autowired
    DemoApi demoApi;

    @RequestMapping(method = RequestMethod.GET)
    public String echo(String content) {
        System.out.println("#####content:" + content);
        String msg = demoApi.echo(content);
        return "SUCESS" + msg;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String pay() {
        String amount = demoApi.payment(10000);
        return "SUCESS" + amount;
    }
}
