/* 
 * @(#)HttpInvokerServiceClient.java    Created on 2012-5-18
 * Copyright (c) 2005-2012 Shunwang. All rights reserved.
 * $Id$
 */
package demo.rpc.spring.rmi.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import demo.rpc.common.HelloService;

/**
 * Spring RMI 服务的客户端调用类。
 * 
 * @author wj.huang
 * @version $Revision: 1.0 $, $Date: 2012-5-18 下午6:06:53 $
 */
public class SpringRmiServiceClient {

    public static void main(String[] args) {
        // 以配置方式创建 RMI 服务的客户端类
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/rmi/client.xml");
        HelloService service = (HelloService) context.getBean("helloService");
        String result = service.sayHello("Spring RMI");
        System.out.println(result);

        // 以编程方式创建 RMI 服务的客户端类
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();

        // 经过测试只能通过命令行参数设置才有效，如 -Dsun.rmi.transport.tcp.responseTimeout=3000
        // System.setProperty("sun.rmi.transport.connectionTimeout", "1000"); // 设置连接超时时间
        // System.setProperty("sun.rmi.transport.tcp.responseTimeout", "3000"); // 设置读写超时时间

        factoryBean.setServiceInterface(HelloService.class);
        factoryBean.setServiceUrl("rmi://localhost/springRmiHelloService");
        factoryBean.afterPropertiesSet();

        HelloService anotherService = (HelloService) factoryBean.getObject();
        result = anotherService.sayHello("Spring RMI again");
        System.out.println(result);
    }

}
