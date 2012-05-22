/* 
 * @(#)CxfHelloServiceImpl.java    Created on 2012-5-21
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package com.shunwang.starmedia.demo.rpc.spring.cxf.server;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

/**
 * Apache CXF 的服务提供类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-21 下午2:17:37 $
 */
@Component
@WebService(endpointInterface = "com.shunwang.starmedia.demo.rpc.spring.cxf.server.CxfHelloService")
public class CxfHelloServiceImpl implements CxfHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
