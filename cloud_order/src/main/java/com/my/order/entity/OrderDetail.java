package com.my.order.entity;

import lombok.Data;

/**
 * @author pengwei
 * @version 1.0
 * @date 2020/4/3 14:27
 * @description
 */
@Data
public class OrderDetail {

    private String orderId;

    private Item item = new Item();

    public OrderDetail() {}

    public OrderDetail(String orderId, Item item) {
        this.orderId = orderId;
        this.item = item;
    }
}
