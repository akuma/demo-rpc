/* 
 * @(#)HttpInvokerServiceServer.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package com.shunwang.starmedia.demo.rpc.spring.rmi.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring RMI 的服务器端类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午6:08:57 $
 */
public class SpringRmiServiceServer {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring/rmi/server.xml");
        System.out.println("Spring RMI Server has been started.");
    }

}
