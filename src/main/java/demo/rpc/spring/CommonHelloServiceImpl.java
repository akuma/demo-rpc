/* 
 * @(#)CommonHelloServiceImpl.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.spring;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.stereotype.Component;

import demo.rpc.common.HelloService;
import demo.rpc.common.Student;

/**
 * 通用的 HelloService 的服务实现类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午5:06:19 $
 */
@Component
public class CommonHelloServiceImpl implements HelloService {

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
