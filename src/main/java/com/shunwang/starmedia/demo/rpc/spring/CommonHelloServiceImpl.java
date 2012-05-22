/* 
 * @(#)CommonHelloServiceImpl.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package com.shunwang.starmedia.demo.rpc.spring;

import org.springframework.stereotype.Component;

import com.shunwang.starmedia.demo.rpc.common.HelloService;

/**
 * 通用的 HelloService 的服务提供类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午5:06:19 $
 */
@Component
public class CommonHelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
