package com.wetech.zhy.service.impl;

import com.wetech.zhy.entity.KoJinJoHoZhy;
import com.wetech.zhy.mapper.KoJinJoHoZhyMapper;
import com.wetech.zhy.service.KoJinJoHoZhyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KoJinJoHoZhyServiceImpl implements KoJinJoHoZhyService {

    @Autowired
    private KoJinJoHoZhyMapper koJinJoHoZhyMapper;
    @Override
    // 個人情報の保存
    public int save(KoJinJoHoZhy koJinJoHoZhy) {
        return koJinJoHoZhyMapper.save(koJinJoHoZhy);
    }
}
