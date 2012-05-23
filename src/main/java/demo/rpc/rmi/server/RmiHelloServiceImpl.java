/* 
 * @(#)RmiHelloServiceImpl.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.rmi.server;

import java.rmi.RemoteException;

import demo.rpc.rmi.server.RmiHelloService;

/**
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午4:28:14 $
 */
public class RmiHelloServiceImpl implements RmiHelloService {

    @Override
    public String sayHello(String name) throws RemoteException {
        return "Hello, " + name + "!";
    }

}
