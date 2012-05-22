/* 
 * @(#)CxfHelloService.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package com.shunwang.starmedia.demo.rpc.spring.cxf.server;

import java.rmi.RemoteException;
import java.util.List;

import javax.jws.WebService;

import com.shunwang.starmedia.demo.rpc.common.Student;

/**
 * Apache CXF 版本的远程服务接口。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午4:18:27 $
 */
@WebService
public interface CxfHelloService {

    /**
     * 问候方法。
     * 
     * @param name
     *            用户姓名
     * @return 问候用户的语句
     * @throws RemoteException
     *             远程服务调用异常
     */
    String sayHello(String name);

    /**
     * 获取学生信息。
     * 
     * @return 学生信息列表
     */
    List<Student> getStudents();

}
