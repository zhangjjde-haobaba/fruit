package com.kgc.service;

import com.kgc.entity.Fruit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.kgc.vo.BarVo;
import com.kgc.vo.PieVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Jiang Yiwei
 * @since 2021-08-08
 */
public interface FruitService extends IService<Fruit> {
    public BarVo barVoList();

    public List<PieVo> pieVoList();
}
