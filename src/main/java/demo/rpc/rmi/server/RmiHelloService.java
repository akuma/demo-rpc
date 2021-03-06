/* 
 * @(#)RmiHelloService.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程服务接口。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午4:18:27 $
 */
public interface RmiHelloService extends Remote {

    /**
     * 问候方法。
     * 
     * @param name
     *            用户姓名
     * @return 问候用户的语句
     * @throws RemoteException
     *             远程服务调用异常
     */
    String sayHello(String name) throws RemoteException;

}
