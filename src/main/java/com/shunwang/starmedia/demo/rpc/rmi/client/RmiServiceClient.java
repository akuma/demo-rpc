/* 
 * @(#)RmiServiceClient.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package com.shunwang.starmedia.demo.rpc.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.shunwang.starmedia.demo.rpc.rmi.server.RmiHelloService;

/**
 * 调用 RMI 服务的客户端类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午4:44:33 $
 */
public class RmiServiceClient {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost");
        String name = "helloService";
        RmiHelloService service = (RmiHelloService) registry.lookup(name);
        String result = service.sayHello("RMI");
        System.out.println(result);
    }

}
