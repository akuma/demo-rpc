/* 
 * @(#)JwsHelloServiceImpl.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package com.shunwang.starmedia.demo.rpc.jws.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.shunwang.starmedia.demo.rpc.common.HelloService;

/**
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午5:06:19 $
 */
@WebService(name = "helloService", serviceName = "helloService", targetNamespace = "http://demo.starmedia.shunwang.com"
        + "/rpc/jws/server")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class JwsHelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

}
