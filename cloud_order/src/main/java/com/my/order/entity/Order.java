package com.my.order.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author pengwei
 * @version 1.0
 * @date 2020/4/3 14:26
 * @description
 */
@Data
public class Order {

    private String orderId;

    private Long userId;

    private Date createDate;

    private Date updateDate;

    private List<OrderDetail> orderDetails;

}
