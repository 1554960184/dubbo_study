package com.buckwheat.dubbo.service.impl;

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
    @Autowired
    UserService userService;
    public void initOrder(String userId) {
        System.out.println("用户id:"+userId);
        //查询用户的收获地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress address:addressList) {
            System.out.println(address.getUserAddress());
        }
    }
}
