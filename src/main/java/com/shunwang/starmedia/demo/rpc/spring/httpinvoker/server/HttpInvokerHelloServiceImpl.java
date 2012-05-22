/* 
 * @(#)HttpInvokerHelloServiceImpl.java    Created on 2012-5-21
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package com.shunwang.starmedia.demo.rpc.spring.httpinvoker.server;

import org.springframework.stereotype.Component;

import com.shunwang.starmedia.demo.rpc.common.HelloService;

/**
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-21 上午10:18:13 $
 */
@Component
public class HttpInvokerHelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
