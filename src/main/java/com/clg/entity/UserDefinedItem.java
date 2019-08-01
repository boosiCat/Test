package com.clg.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserDefinedItem implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 自定义套餐名称
     */
    private String name;

    /**
     * 查询项
     */
    private String item;

    /**
     * 是否删除 0.未删除 1.已删除
     */
    private Boolean deleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * user_defined_item
     */
    private static final long serialVersionUID = 1L;
}
