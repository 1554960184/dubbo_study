package com.buckwheat.dubbo;

import com.buckwheat.dubbo.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext pathXmlApplicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService bean = pathXmlApplicationContext.getBean(OrderService.class);
        bean.initOrder("1");
        System.out.println("调用完成。。。。。");
        System.in.read();
    }
}
