/* 
 * @(#)JwsServiceServer.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.jws.server;

import javax.xml.ws.Endpoint;

/**
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午5:11:39 $
 */
public class JwsServiceServer {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost/helloService", new JwsHelloServiceImpl());
        System.out.println("Java WebService Server has been started.");
    }

}
