package com.kgc.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiang on 8/8/21 10:43 PM
 */
public class DataUtil {

    public static Map<String,Object> createItemStyle(Integer sale){
        String color = "";
        if(sale<50){
            color = "#96dee8";
        }
        if(sale>50 && sale <150){
            color = "#c4ebad";
        }
        if(sale>150 && sale <300){
            color = "#6be6c1";
        }
        if(sale>300 && sale <500){
            color = "#3f81e3";
        }
        if(sale>500){
            color = "#a0a7e6";
        }
        Map<String,Object> map = new HashMap<>();
        map.put("color",color);
        return map;


    }


}
