package com.kgc.vo;

import lombok.Data;

import java.util.Map;

/**
 * Created by jiang on 8/8/21 10:22 PM
 */
@Data
public class DataVo {
    /**
     * 根据value和itemStyle设置vo
     * {
     *               value: 333,
     *               itemStyle: {
     *                 color: "#3fb1e3"
     *               }
     *             }
     */

    private Integer value;
    private Map<String,Object> itemStyle;
}
