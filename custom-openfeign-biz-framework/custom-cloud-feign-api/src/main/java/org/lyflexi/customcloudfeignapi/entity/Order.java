package org.lyflexi.customcloudfeignapi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: lyflexi
 * @project: debuginfo_jdkToFramework
 * @Date: 2024/7/27 13:53
 */
@Data
public class Order implements Serializable {
    private Long id;
    private String name;

    public Order() {}

    public Order(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
