package com.my.order.feign;

import com.my.order.entity.Item;
import com.my.order.fallback.ItemServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author pengwei
 * @version 1.0
 * @date 2020/4/15 14:04
 * @description
 */
@FeignClient(value="cloud-service",fallback = ItemServiceFallback.class)
public interface ItemFeignClient {

    @GetMapping("/item/{id}")
    Item queryItemById(@PathVariable("id")Long id);
}
