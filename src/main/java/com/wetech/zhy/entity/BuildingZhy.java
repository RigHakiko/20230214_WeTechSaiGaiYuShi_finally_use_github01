package com.wetech.zhy.entity;

import java.math.BigDecimal;

public class BuildingZhy {

    //申込ID
    private Integer name;

    //被災住宅の種類
    private String dbHisaijutakuShurui;

    //被災住宅の所有等
    private String dbHisaijutakuShoyuu;

    //被害状況
    private String dbHigaiJokyo;

    //被災住宅の修理が不能又は困難である
    private String dbHigaiJokyoDaikiboHankaiOrHankai;

    //敷地の面積（㎡）
    private BigDecimal dbBukken_Menseki;



  private String  aplBukkenAddressTodofuken;
    private String       dbBukkenAddressShigun;
    private String   DBBukkenAddressChoson;
    private String       aplBukkenAddressBanchi;
    private String   aplBukkenAddressPostCode3;
    private Boolean      dbBousaiSyudanItenJigyo;
    private String    dbBukkenShikichiNoShoyuKankei;
      private    BigDecimal     dbBukken_Tatemono_Jutaku;
    private    BigDecimal    dbBukken_Tatemono_HiJutaku;
    private    String       dbBukken_Kozo;
    private    String   dbBukken_TatekataKodateKeishiki;
    private    String       dbNyukyoYoteiDateYear;
    private    String   dbNyukyoYoteiDateMonth;
    private   String       dbJutakuYoto;
    private   String     dbBukken_KojiKanryoDate_Year;
    private   String         dbBukken_KojiKanryoDate_Month;

    private   String    dbShikinDateTochiShikinYear;
    private   String           dbShikinDateTochiShikinMonth;
    private    String     dbShikinDateChukanShikinYear;
    private   String          dbShikinDateChukanShikinMonth;
    private  String    dbShikinDateSaishuShikinYear;
    private   String          dbShikinDateSaishuShikinMonth;

    private    String     dbKariireIninKaishaName;
    private    String         dbChukaiHanbaiNameKana;

    private   String     dbChukaiHanbaiTantoshaNameMei;
    private   String         dbChukaiHanbaiTantoshaNameSei;

    private   BigDecimal    dbHiyouKensetsuHi;
    private    BigDecimal         dbHiyouTochiSyotokuHi;
    private    BigDecimal     dbHiyouTotal;

    private   BigDecimal         dbKariireGakuKingaku;
    private    BigDecimal   dbKariireGakuKinri;
    private    BigDecimal         dbKariireGakuHensaiKikan;
    private   BigDecimal    dbKariireGakuNenHensai12No1;
    private    String          dbHensaiHouhou;
    private    String    dbHisaiShinzokuDokyoAri;
    private   String          dbSueokiKikanNoNensu;

    private     String     dbSonotaName;
    private    BigDecimal       dbSonotaKingaku;
    private  BigDecimal   dbSonotaHensaiKikan;
    private    BigDecimal        dbSonotaNenHensai12No1;

//     private   BigDecimal    dbHiyouTotal;
private BigDecimal       dbSogoKingaku;
    private    String     dbKinyuKikanName;
    private   String          dbShitemName;


}
