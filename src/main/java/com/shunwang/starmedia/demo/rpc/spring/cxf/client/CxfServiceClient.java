/* 
 * @(#)CxfServiceClient.java    Created on 2012-5-21
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package com.shunwang.starmedia.demo.rpc.spring.cxf.client;

import java.io.IOException;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shunwang.starmedia.demo.rpc.spring.cxf.server.CxfHelloService;

/**
 * Cxf WebService 服务的客户端调用类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-21 下午3:12:33 $
 */
public class CxfServiceClient {

    public static void main(String[] args) throws IOException {
        // 以配置方式创建 WebService 服务的客户端类
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/cxf/client.xml");
        CxfHelloService service = (CxfHelloService) context.getBean("helloService");
        String result = service.sayHello("Apache CXF");
        System.out.println(result);

        // 以编程方式创建 WebService 服务的客户端类
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://localhost/demorpc/services/cxfHelloService");

        CxfHelloService anotherService = factoryBean.create(CxfHelloService.class);
        Client client = ClientProxy.getClient(anotherService);
        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(1 * 1000); // 设置连接超时时间
        httpClientPolicy.setReceiveTimeout(3 * 1000); // 设置读写超时时间
        conduit.setClient(httpClientPolicy);

        result = anotherService.sayHello("Apache CXF again");
        System.out.println(result);
    }

}
