package com.my.order.service;


import com.my.order.entity.Item;
import com.my.order.properties.OrderProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author pengwei
 * @version 1.0
 * @date 2020/4/3 14:06
 * @description
 */
@Service
public class ItemService {
    // Spring框架对RESTful方式的http请求做了封装，来简化操作
    @Autowired
    private RestTemplate restTemplate;

    /* @Value("${mycloud.item.url}")
    private String itemUrl;

    public Item queryItemById(Long id) {
        return this.restTemplate.getForObject(itemUrl+id, Item.class);
    }*/

    /*@Autowired
    OrderProperties orderProperties;

    public Item queryItemById(Long id) {
        return this.restTemplate.getForObject(orderProperties.getItem().getUrl()
                + id, Item.class);
    }*/

    //走rureka_cloud
    @Autowired
    OrderProperties orderProperties;

    public Item queryItemById(Long id) {
        // 该方法走eureka注册中心调用(去注册中心根据app-item查找服务，这种方式必须先开启负载均衡@LoadBalanced)
        String itemUrl = "http://cloud-service/item/{id}";
        Item result = restTemplate.getForObject(itemUrl, Item.class, id);
        System.out.println("订单系统调用商品服务,result:" + result);
        return result;
    }
}
