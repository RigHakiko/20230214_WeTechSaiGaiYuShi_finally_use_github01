package com.wetech.zhy.mapper;

import com.wetech.zhy.entity.KoJinJoHoZhy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface KoJinJoHoZhyMapper {
    int save(KoJinJoHoZhy koJinJoHoZhy);
}
