package com.my.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

@SpringBootTest
class CloudOrderApplicationTests {

    @Autowired
    private LoadBalancerClient loadBalancerClient;//自动注入

    @Test
    void contextLoads() {
        String serviceId = " cloud-service";
        for (int i = 0; i < 20; i++) {
            ServiceInstance serviceInstance = this.loadBalancerClient.choose(serviceId);
            System.out.println("第" + (i + 1) + "次：" + serviceInstance.getHost() + ": " + serviceInstance.getPort());
        }
    }

}
