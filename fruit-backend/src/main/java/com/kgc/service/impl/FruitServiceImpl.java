package com.kgc.service.impl;

import com.kgc.entity.Fruit;
import com.kgc.mapper.FruitMapper;
import com.kgc.service.FruitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kgc.util.DataUtil;
import com.kgc.vo.BarVo;
import com.kgc.vo.DataVo;
import com.kgc.vo.PieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jiang Yiwei
 * @since 2021-08-08
 */
@Service
public class FruitServiceImpl extends ServiceImpl<FruitMapper, Fruit> implements FruitService {

    @Autowired(required=false)
    private FruitMapper fruitMapper;

    @Override
    public BarVo barVoList() {
        BarVo barVo = new BarVo();
        List<String> names = new ArrayList<>();
        List<DataVo> values = new ArrayList<>();
        //先查出数据
        List<Fruit> fruits = fruitMapper.selectList(null);
        //再转换vo
        for (Fruit fruit:fruits
             ) {
            names.add(fruit.getName());
            DataVo dataVo = new DataVo();
            dataVo.setValue(fruit.getSale());
//            Map<String,Object> map = new HashMap<>();
//            map.put("color","000000");
            dataVo.setItemStyle(DataUtil.createItemStyle(fruit.getSale()));
            values.add(dataVo);
        }
        barVo.setNames(names);
        barVo.setValues(values);
        return barVo;
    }

    @Override
    public List<PieVo> pieVoList() {
        List<PieVo> list = new ArrayList<>();
        //先查出数据
        List<Fruit> fruits = fruitMapper.selectList(null);
        for (Fruit fruit:fruits
             ) {
            PieVo pieVo = new PieVo();
            pieVo.setName(fruit.getName());
            pieVo.setValue(fruit.getSale());
            pieVo.setItemStyle(DataUtil.createItemStyle(fruit.getSale()));
            list.add(pieVo);
        }

        return list;
    }
}
