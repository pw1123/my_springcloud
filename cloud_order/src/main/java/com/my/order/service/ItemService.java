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

    @Autowired
    OrderProperties orderProperties;

    public Item queryItemById(Long id) {
        return this.restTemplate.getForObject(orderProperties.getItem().getUrl()
                + id, Item.class);
    }
}
