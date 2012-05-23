/* 
 * @(#)HttpInvokerServiceClient.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.spring.httpinvoker.client;

import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.remoting.httpinvoker.HttpComponentsHttpInvokerRequestExecutor;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import demo.rpc.common.HelloService;

/**
 * Spring HttpInvoker 服务的客户端调用类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午6:06:53 $
 */
public class HttpInvokerServiceClient {

    public static void main(String[] args) {
        // 以配置方式创建 HttpInovker 服务的客户端类
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/httpinvoker/client.xml");
        HelloService service = (HelloService) context.getBean("helloService");
        String result = service.sayHello("Spring HttpInvoker");
        System.out.println(result);

        // 以编程方式创建 HttpInovker 服务的客户端类
        HttpInvokerProxyFactoryBean factoryBean = new HttpInvokerProxyFactoryBean();

        HttpComponentsHttpInvokerRequestExecutor executor = new HttpComponentsHttpInvokerRequestExecutor();
        executor.setConnectTimeout(1 * 1000); // 设置连接超时时间
        executor.setReadTimeout(3 * 1000); // 设置读写超时时间，Spring 默认 60s

        // 设置站点默认的 HTTP 连接数, Spring 默认 5个，并发请求大的情况下可以增大
        ((ThreadSafeClientConnManager) executor.getHttpClient().getConnectionManager()).setDefaultMaxPerRoute(50);

        factoryBean.setHttpInvokerRequestExecutor(executor);

        factoryBean.setServiceInterface(HelloService.class);
        factoryBean.setServiceUrl("http://localhost/demorpc/remoting/httpInvokerHelloService");
        factoryBean.afterPropertiesSet();

        HelloService anotherService = (HelloService) factoryBean.getObject();
        result = anotherService.sayHello("Spring HttpInvoker again");
        System.out.println(result);
    }

}
