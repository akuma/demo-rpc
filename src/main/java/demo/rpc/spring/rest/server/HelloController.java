/* 
 * @(#)HelloController.java    Created on 2012-5-22
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.spring.rest.server;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.rpc.common.HelloService;

/**
 * Hello API 控制器。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-22 下午12:54:40 $
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "Just a test.";
    }

    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    @ResponseBody
    public HelloResponse sayHello(@PathVariable("name") String name) {
        String result = helloService.sayHello(name);
        HelloResponse response = new HelloResponse();
        response.setStatus(0);
        response.setResult(result);
        return response;
    }

}
