/* 
 * @(#)CxfHelloServiceImpl.java    Created on 2012-5-21
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.spring.cxf.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.jws.WebService;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Component;

import demo.rpc.common.Student;

/**
 * Apache CXF 的服务提供类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-21 下午2:17:37 $
 */
@Component
@WebService(endpointInterface = "demo.rpc.spring.cxf.server.CxfHelloService")
public class CxfHelloServiceImpl implements CxfHelloService {

    private static final List<Student> students = new ArrayList<Student>();

    static {
        int count = 1000;
        for (int i = 0; i < count; i++) {
            Student student = new Student();
            student.setId(UUID.randomUUID().toString());
            student.setName(RandomStringUtils.randomAlphabetic(10));
            student.setAge(RandomUtils.nextInt(18));
            student.setBirthday(new Date());

            students.add(student);
        }
    }

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

}
