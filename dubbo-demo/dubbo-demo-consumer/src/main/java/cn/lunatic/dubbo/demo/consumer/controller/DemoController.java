package cn.lunatic.dubbo.demo.consumer.controller;

import cn.lunatic.dubbo.demo.api.service.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ganluantic
 * @Description
 * @date 2018/8/11 14:39
 */
@RestController
public class DemoController {
    @Reference
    DemoService demoService;

    @RequestMapping("hello")
    public String hello(){
        return demoService.hello("Word");
    }

}
