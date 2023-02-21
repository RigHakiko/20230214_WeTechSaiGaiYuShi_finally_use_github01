package com.wetech.zhy.service.impl;

import com.wetech.zhy.entity.CollateralProviderZhy;
import com.wetech.zhy.mapper.CollateralProviderZhyMapper;
import com.wetech.zhy.service.CollateralProviderZhyService;
import com.wetech.zhy.service.KoJinJoHoZhyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollateralProviderZhyServiceImpl implements CollateralProviderZhyService {

    @Autowired
    CollateralProviderZhyMapper collateralProviderZhyMapper;
    @Override
    public int save(CollateralProviderZhy collateralProviderZhy) {
        return collateralProviderZhyMapper.save(collateralProviderZhy);
    }
}
