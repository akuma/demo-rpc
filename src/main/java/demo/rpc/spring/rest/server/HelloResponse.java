/* 
 * @(#)HelloResponse.java    Created on 2012-5-22
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.spring.rest.server;

import java.io.Serializable;

/**
 * Hello 服务的返回结果封装类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-22 下午4:08:44 $
 */
public class HelloResponse implements Serializable {

    private static final long serialVersionUID = 178953929725973313L;

    public HelloResponse() {
    }

    private int status;
    private String result;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
