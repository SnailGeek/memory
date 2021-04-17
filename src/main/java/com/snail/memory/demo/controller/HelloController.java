package com.snail.memory.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: HelloController
 * @description:
 * @author: wangf-q
 * @date: 2021-04-15 17:32
 **/
@Slf4j
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/hello")
    public String index() {
        for (String serviceId : client.getServices()) {
            for (ServiceInstance serviceInstance : client.getInstances(serviceId)) {
                log.info("/hello, host:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId());
            }
        }
        return "Hello ";
    }
}
