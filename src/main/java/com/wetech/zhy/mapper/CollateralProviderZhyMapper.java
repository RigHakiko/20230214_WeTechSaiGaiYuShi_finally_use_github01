package com.wetech.zhy.mapper;

import com.wetech.zhy.entity.CollateralProviderZhy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CollateralProviderZhyMapper {
    int save(CollateralProviderZhy collateralProviderZhy);
}
