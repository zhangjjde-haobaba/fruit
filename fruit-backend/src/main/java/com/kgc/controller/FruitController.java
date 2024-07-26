package com.kgc.controller;


import com.kgc.entity.Fruit;
import com.kgc.service.FruitService;
import com.kgc.vo.BarVo;
import com.kgc.vo.PieVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jiang Yiwei
 * @since 2021-08-08
 */
@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Autowired
    private FruitService fruitService;

    @GetMapping("/list")
    public List<Fruit> fruitList(){
        return this.fruitService.list();
    }
    @DeleteMapping("/deleteById/{id}")
    public boolean deleteById(@PathVariable("id") Integer id){
        return this.fruitService.removeById(id);
    }

    @GetMapping("/find/{id}")
    public Fruit findById(@PathVariable("id") Integer id){
        return this.fruitService.getById(id);
    }

    @PutMapping("/update")
    public boolean update(@RequestBody Fruit fruit){
        return this.fruitService.updateById(fruit);
    }
    @PostMapping("/add")
    public boolean add(@RequestBody Fruit fruit){
        return this.fruitService.save(fruit);
    }

    @GetMapping("/barVo")
    public BarVo barVo(){
        return this.fruitService.barVoList();
    }

    @GetMapping("/pieVo")
    public List<PieVo> pieVoList(){
        return this.fruitService.pieVoList();
    }
}

