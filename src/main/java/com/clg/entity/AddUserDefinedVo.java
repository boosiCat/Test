package com.clg.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


@Data
public class AddUserDefinedVo implements Serializable {

    private List<String> queryItem;

    private String queryName;

    private BigDecimal selfPayTotal;

    private BigDecimal otherPayTotal;

    private String userId;
}
