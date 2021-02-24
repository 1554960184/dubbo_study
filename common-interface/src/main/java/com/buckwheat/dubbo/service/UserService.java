package com.buckwheat.dubbo.service;

import com.buckwheat.dubbo.bean.UserAddress;

import java.util.List;

/**
 * 用户服务
 */
public interface UserService {
    /**
     * 根据用户ID返回用户所有收货地址
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
