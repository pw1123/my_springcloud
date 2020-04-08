package com.my.order.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author pengwei
 * @version 1.0
 * @date 2020/4/3 14:46
 * @description
 */
@Component
@Data
@ConfigurationProperties(prefix="mycloud")
public class OrderProperties {

    private ItemProperties item = new ItemProperties();
}
