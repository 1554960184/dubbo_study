package com.buckwheat.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.buckwheat.dubbo.bean.UserAddress;
import com.buckwheat.dubbo.service.OrderService;
import com.buckwheat.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1.将服务注册到注册中心
 *      1).导入dubbo依赖(2.6.2)\zookeeper依赖(curator)
 *      2).配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    UserService userService;
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> userAddresses = userService.getUserAddressList(userId);
        System.out.println("当前接收到的userId=>"+userId);
        System.out.println("**************");
        System.out.println("查询到的所有地址为：");
        for (UserAddress userAddress:userAddresses) {
            System.out.println(userAddress.getUserAddress());
        }
        return userAddresses;
    }
}
