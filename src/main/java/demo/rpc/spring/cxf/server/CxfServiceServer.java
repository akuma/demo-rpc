/* 
 * @(#)CxfServiceServer.java    Created on 2012-5-22
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.spring.cxf.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Apache CXF 的服务器端类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-22 上午10:29:15 $
 */
public class CxfServiceServer {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("spring/cxf/server.xml");
        System.out.println("Apache CXF Server has been started.");
    }

}
