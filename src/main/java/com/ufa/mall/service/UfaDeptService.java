package com.ufa.mall.service;

import com.ufa.mall.entity.UfaDept;
import com.ufa.mall.mapper.UfaDeptMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UfaDeptService {
    @Autowired
    UfaDeptMapper ufaDeptMapper;

    public UfaDeptService(UfaDeptMapper ufaDeptMapper) {
        this.ufaDeptMapper = ufaDeptMapper;
    }

    public UfaDept queryById(int id){
        return ufaDeptMapper.queryById(id);
    }
}
