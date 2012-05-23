/* 
 * @(#)RmiServiceServer.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * 提供 RMI 服务的服务端类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午4:41:48 $
 */
public class RmiServiceServer {

    public static void main(String[] args) throws RemoteException {
        int port = 9527;
        String name = "helloService";
        RmiHelloService service = new RmiHelloServiceImpl();
        UnicastRemoteObject.exportObject(service, port);
        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        registry.rebind(name, service);
        System.out.println("RMI Server has been started.");
    }

}
