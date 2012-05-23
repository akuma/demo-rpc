/* 
 * @(#)Student.java    Created on 2012-5-22
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.common;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生信息类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-22 下午4:50:44 $
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -2835173119952196877L;

    private String id;
    private String name;
    private int age;
    private Date birthday;

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
