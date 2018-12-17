package com.baizhi.controller;

import com.baizhi.entity.Clazz;
import com.baizhi.mapper.ClazzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "aa", produces = "application/json;charset=UTF-8")
public class ClazzController {

    @Autowired
    ClazzMapper clazzMapper;

    @RequestMapping("a")
    public Clazz query() {
        return clazzMapper.selectByPrimaryKey(3);
    }
}
