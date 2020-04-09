package com.my.microservice.entity;

import lombok.Data;

/**
 * @author pengwei
 * @version 1.0
 * @date 2020/4/3 14:05
 * @description
 */
@Data
public class Item {

    private Long id;

    private String title;

    private String pic;

    private String desc;

    private Long price;

    public Item(){}

    public Item(long id, String title, String pic, String desc, Long price) {
        this.id=id;
        this.title=title;
        this.pic=pic;
        this.desc=desc;
        this.price=price;
    }
}
