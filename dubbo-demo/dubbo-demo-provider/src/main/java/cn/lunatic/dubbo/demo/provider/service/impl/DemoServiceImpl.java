package cn.lunatic.dubbo.demo.provider.service.impl;

import cn.lunatic.dubbo.demo.api.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author ganluantic
 * @Description
 * @date 2018/8/11 14:05
 */
@Service
public class DemoServiceImpl implements DemoService {
    public String hello(String word) {
        return "Hello " + word + "!";
    }
}
