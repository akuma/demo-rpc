/* 
 * @(#)JwsServiceClient.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.jws.client;

import demo.rpc.jws.server.HelloService;
import demo.rpc.jws.server.HelloService_Service;

/**
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午5:05:41 $
 */
public class JwsServiceClient {

    public static void main(String[] args) {
        HelloService_Service helloServiceService = new HelloService_Service();
        HelloService service = helloServiceService.getHelloServicePort();
        String result = service.sayHello("Java WebService");
        System.out.println(result);
    }

}
