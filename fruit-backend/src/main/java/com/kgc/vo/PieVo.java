package com.kgc.vo;

import lombok.Data;

import java.util.Map;

/**
 * Created by jiang on 8/8/21 11:04 PM
 */
@Data
public class PieVo {

    private Integer value;
    private Map<String,Object> itemStyle;
    private String name;
}
