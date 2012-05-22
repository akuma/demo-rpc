/* 
 * @(#)SpringRmiHelloServiceImpl.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package com.shunwang.starmedia.demo.rpc.spring.rmi.server;

import org.springframework.stereotype.Component;

import com.shunwang.starmedia.demo.rpc.common.HelloService;

/**
 * Spring RMI 的服务提供类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午5:06:19 $
 */
@Component
public class SpringRmiHelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
