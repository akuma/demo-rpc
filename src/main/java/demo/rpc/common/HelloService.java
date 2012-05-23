/* 
 * @(#)HelloService.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.common;

import java.util.List;

/**
 * 通用的远程服务接口。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午4:18:27 $
 */
public interface HelloService {

    /**
     * 问候方法。
     * 
     * @param name
     *            用户姓名
     * @return 问候用户的语句
     */
    String sayHello(String name);

    /**
     * 获取学生信息。
     * 
     * @return 学生信息列表
     */
    List<Student> getStudents();

}
