package com.wetech.zhy.mapper;

import com.wetech.zhy.entity.BuildingZhy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BuildingZhyMapper {
    int save(BuildingZhy buildingZhy);
}
