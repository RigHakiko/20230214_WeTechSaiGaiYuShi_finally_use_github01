package com.wetech.zhy;

import com.wetech.zhy.entity.KoJinJoHoZhy;
import com.wetech.zhy.mapper.KoJinJoHoZhyMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class WeTechSaiGaiYuShiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    KoJinJoHoZhyMapper koJinJoHoZhyMapper;
    @Test
    void test01_20230214(){
        KoJinJoHoZhy koJinJoHoZhy = new KoJinJoHoZhy();
        koJinJoHoZhy.setCpNamesei("1");
        koJinJoHoZhy.setCpNamemei("2");
        koJinJoHoZhy.setCpNameseikana("3");
        koJinJoHoZhy.setCpNamemeikana("4");
        koJinJoHoZhy.setCuAlphlastname("5");
        koJinJoHoZhy.setCuAlphfirstname("6");
        koJinJoHoZhy.setCpCountry("7");
        koJinJoHoZhy.setCpBirthdate(LocalDate.now());
        koJinJoHoZhy.setCpSex("8");
        koJinJoHoZhy.setCpDenwa("9");
        koJinJoHoZhy.setCpPhone("10");
        koJinJoHoZhy.setCpShokugyocode("11");
        koJinJoHoZhy.setCpKinmusakiname("12");
        int save = koJinJoHoZhyMapper.save(koJinJoHoZhy);
        System.out.println(save);
    }
}
