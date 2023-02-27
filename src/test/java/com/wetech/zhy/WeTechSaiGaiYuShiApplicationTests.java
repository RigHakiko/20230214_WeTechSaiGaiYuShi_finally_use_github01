package com.wetech.zhy;

import com.wetech.zhy.entity.BuildingZhy;
import com.wetech.zhy.entity.CollateralProviderZhy;
import com.wetech.zhy.entity.KoJinJoHoZhy;
import com.wetech.zhy.mapper.BuildingZhyMapper;
import com.wetech.zhy.mapper.CollateralProviderZhyMapper;
import com.wetech.zhy.mapper.KoJinJoHoZhyMapper;
import com.wetech.zhy.service.BuildingZhyService;
import com.wetech.zhy.service.CollateralProviderZhyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
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

    @Autowired
    private BuildingZhyMapper buildingZhyMapper;
    @Autowired
    private BuildingZhyService buildingZhyService;
    @Test
    void test_20230227_BuildingZhy(){
        BuildingZhy buildingZhy = new BuildingZhy();
        buildingZhy.setName(1);
        buildingZhy.setDbHisaijutakuShurui("2");
        buildingZhy.setDbHisaijutakuShoyuu("3");
        buildingZhy.setDbHigaiJokyo("4");

        buildingZhy.setDbHigaiJokyoDaikiboHankaiOrHankai("5");
        buildingZhy.setDbBukken_Menseki(BigDecimal.valueOf(6.6));

        buildingZhy.setAplBukkenAddressTodofuken("7");
        buildingZhy.setDbBukkenAddressShigun("8");
        buildingZhy.setDbBukkenAddressChoson("9");

        buildingZhy.setAplBukkenAddressBanchi("10");
        buildingZhy.setAplBukkenAddressPostCode3("11");

        buildingZhy.setDbBousaiSyudanItenJigyo("12");
        buildingZhy.setDbBukkenShikichiNoShoyuKankei("13");
        buildingZhy.setDbBukken_Tatemono_Jutaku(BigDecimal.valueOf(14));
        buildingZhy.setDbBukken_Tatemono_HiJutaku(BigDecimal.valueOf(15));
        buildingZhy.setDbBukken_Kozo("16");
        buildingZhy.setDbBukken_TatekataKodateKeishiki("17");
        buildingZhy.setDbNyukyoYoteiDateYear("18");

        buildingZhy.setDbNyukyoYoteiDateMonth("19");
        buildingZhy.setDbJutakuYoto("20");
        buildingZhy.setDbBukken_KojiKanryoDate_Year("21");

        buildingZhy.setDbBukken_KojiKanryoDate_Month("22");
        buildingZhy.setDbShikinDateTochiShikinYear("23");
        buildingZhy.setDbShikinDateTochiShikinMonth("24");

        buildingZhy.setDbShikinDateChukanShikinYear("25");

        buildingZhy.setDbShikinDateChukanShikinMonth("26");
        buildingZhy.setDbShikinDateSaishuShikinYear("27");
        buildingZhy.setDbShikinDateSaishuShikinMonth("28");

        buildingZhy.setDbKariireIninKaishaName("29");
        buildingZhy.setDbChukaiHanbaiNameKana("30");

        buildingZhy.setDbChukaiHanbaiTantoshaNameMei("31");
        buildingZhy.setDbChukaiHanbaiTantoshaNameSei("32");

        buildingZhy.setDbHiyouKensetsuHi(BigDecimal.valueOf(33));
        buildingZhy.setDbHiyouTochiSyotokuHi(BigDecimal.valueOf(34));
        buildingZhy.setDbHiyouTotal(BigDecimal.valueOf(35));
        buildingZhy.setDbKariireGakuKingaku(BigDecimal.valueOf(36));
        buildingZhy.setDbKariireGakuKinri(BigDecimal.valueOf(37));
        buildingZhy.setDbKariireGakuHensaiKikan(BigDecimal.valueOf(38));
        buildingZhy.setDbKariireGakuNenHensai12No1(BigDecimal.valueOf(39));

        buildingZhy.setDbHensaiHouhou("40");
        buildingZhy.setDbHisaiShinzokuDokyoAri("41");
        buildingZhy.setDbSueokiKikanNoNensu("42");
        buildingZhy.setDbSonotaName("43");
        buildingZhy.setDbSonotaKingaku(BigDecimal.valueOf(44));

        buildingZhy.setDbSonotaHensaiKikan(BigDecimal.valueOf(45));
        buildingZhy.setDbSonotaNenHensai12No1(BigDecimal.valueOf(46));

        buildingZhy.setDbSogoKingaku(BigDecimal.valueOf(47));
        buildingZhy.setDbKinyuKikanName("48");
        buildingZhy.setDbShitemName("49");







        buildingZhyMapper.save(buildingZhy);


    }
}
