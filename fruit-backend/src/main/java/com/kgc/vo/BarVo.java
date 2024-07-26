package com.kgc.vo;

import lombok.Data;

import java.util.List;

/**
 * Created by jiang on 8/8/21 10:19 PM
 */
@Data
public class BarVo {
    /**
     * xAxis里名称的集合
     * names解析:
     * data: [
     *             "苹果",
     *             "香蕉",
     *             "橘子",
     *             "火龙果",
     *             "葡萄",
     *             "西瓜"
     *           ]
     * values解析
     * data: [
     *             {
     *               value: 333,
     *               itemStyle: {
     *                 color: "#3fb1e3"
     *               }
     *             }
     *         ]
     */

    private List<String> names;
    private List<DataVo> values;
}
