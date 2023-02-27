package com.wetech.zhy.service.impl;

import com.wetech.zhy.entity.BuildingZhy;
import com.wetech.zhy.mapper.BuildingZhyMapper;
import com.wetech.zhy.service.BuildingZhyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingZhyServiceImpl implements BuildingZhyService {

    @Autowired
    BuildingZhyMapper buildingZhyMapper;


    @Override
    public int save(BuildingZhy buildingZhy) {
        return buildingZhyMapper.save(buildingZhy);
    }
}
