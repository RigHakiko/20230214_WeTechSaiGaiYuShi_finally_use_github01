package com.wetech.zhy;

import com.wetech.zhy.entity.CollateralProviderZhy;
import com.wetech.zhy.entity.KoJinJoHoZhy;
import com.wetech.zhy.mapper.CollateralProviderZhyMapper;
import com.wetech.zhy.mapper.KoJinJoHoZhyMapper;
import com.wetech.zhy.service.CollateralProviderZhyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Date;

@SpringBootTest
class WeTechSaiGaiYuShiApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    KoJinJoHoZhyMapper koJinJoHoZhyMapper;

    @Autowired
    CollateralProviderZhyMapper collateralProviderZhyMapper;
    @Autowired
    CollateralProviderZhyService collateralProviderZhyService;
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

    @Test
    void test_20230215_test_CollateralProviderZhy(){
        CollateralProviderZhy collateralProviderZhy = new CollateralProviderZhy();
        collateralProviderZhy.setCpTanpoMono("1");
        collateralProviderZhy.setCpNameMei("2");
        collateralProviderZhy.setCpNameMeiKana("3");
        collateralProviderZhy.setCpNameSei("4");
        collateralProviderZhy.setCpNameSeiKana("5");
        collateralProviderZhy.setCpBirthDateYear(LocalDate.now());
        collateralProviderZhy.setCpBirthDate("7");
        collateralProviderZhy.setCpMoushikomi("8");
        collateralProviderZhy.setCpRentaiSaimushaToOnaji("9");
        collateralProviderZhy.setCpPhone("10");
        collateralProviderZhy.setCpHonninShokugyoCode("11");
        collateralProviderZhy.setCpHonninKinmusakiName("12");
        collateralProviderZhy.setCpReason("13");
        collateralProviderZhy.setCpSame("14");
//        collateralProviderZhyMapper.save(collateralProviderZhy);
        collateralProviderZhyService.save(collateralProviderZhy);
    }
}
