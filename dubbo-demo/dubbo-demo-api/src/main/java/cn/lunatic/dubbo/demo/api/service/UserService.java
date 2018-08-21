package cn.lunatic.dubbo.demo.api.service;

import cn.lunatic.dubbo.demo.api.model.UserInfo;

/**
 * @author ganluantic
 * @Description
 * @date 2018/8/11 13:55
 */
public interface UserService {

    UserInfo getUserByUserId(String userId);

}
