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


    private String aplBukkenAddressTodofuken;
    private String dbBukkenAddressShigun;
    private String dbBukkenAddressChoson;
    private String aplBukkenAddressBanchi;
    private String aplBukkenAddressPostCode3;
    private String dbBousaiSyudanItenJigyo;
    private String dbBukkenShikichiNoShoyuKankei;
    private BigDecimal dbBukken_Tatemono_Jutaku;
    private BigDecimal dbBukken_Tatemono_HiJutaku;
    private String dbBukken_Kozo;
    private String dbBukken_TatekataKodateKeishiki;
    private String dbNyukyoYoteiDateYear;
    private String dbNyukyoYoteiDateMonth;
    private String dbJutakuYoto;
    private String dbBukken_KojiKanryoDate_Year;
    private String dbBukken_KojiKanryoDate_Month;

    private String dbShikinDateTochiShikinYear;
    private String dbShikinDateTochiShikinMonth;
    private String dbShikinDateChukanShikinYear;
    private String dbShikinDateChukanShikinMonth;
    private String dbShikinDateSaishuShikinYear;
    private String dbShikinDateSaishuShikinMonth;

    private String dbKariireIninKaishaName;
    private String dbChukaiHanbaiNameKana;

    private String dbChukaiHanbaiTantoshaNameMei;
    private String dbChukaiHanbaiTantoshaNameSei;

    private BigDecimal dbHiyouKensetsuHi;
    private BigDecimal dbHiyouTochiSyotokuHi;
    private BigDecimal dbHiyouTotal;

    private BigDecimal dbKariireGakuKingaku;
    private BigDecimal dbKariireGakuKinri;
    private BigDecimal dbKariireGakuHensaiKikan;
    private BigDecimal dbKariireGakuNenHensai12No1;
    private String dbHensaiHouhou;
    private String dbHisaiShinzokuDokyoAri;
    private String dbSueokiKikanNoNensu;

    private String dbSonotaName;
    private BigDecimal dbSonotaKingaku;
    private BigDecimal dbSonotaHensaiKikan;
    private BigDecimal dbSonotaNenHensai12No1;

    //     private   BigDecimal    dbHiyouTotal;
    private BigDecimal dbSogoKingaku;
    private String dbKinyuKikanName;
    private String dbShitemName;

    @Override
    public String toString() {
        return "BuildingZhy{" +
                "name=" + name +
                ", dbHisaijutakuShurui='" + dbHisaijutakuShurui + '\'' +
                ", dbHisaijutakuShoyuu='" + dbHisaijutakuShoyuu + '\'' +
                ", dbHigaiJokyo='" + dbHigaiJokyo + '\'' +
                ", dbHigaiJokyoDaikiboHankaiOrHankai='" + dbHigaiJokyoDaikiboHankaiOrHankai + '\'' +
                ", dbBukken_Menseki=" + dbBukken_Menseki +
                ", aplBukkenAddressTodofuken='" + aplBukkenAddressTodofuken + '\'' +
                ", dbBukkenAddressShigun='" + dbBukkenAddressShigun + '\'' +
                ", dbBukkenAddressChoson='" + dbBukkenAddressChoson + '\'' +
                ", aplBukkenAddressBanchi='" + aplBukkenAddressBanchi + '\'' +
                ", aplBukkenAddressPostCode3='" + aplBukkenAddressPostCode3 + '\'' +
                ", dbBousaiSyudanItenJigyo=" + dbBousaiSyudanItenJigyo +
                ", dbBukkenShikichiNoShoyuKankei='" + dbBukkenShikichiNoShoyuKankei + '\'' +
                ", dbBukken_Tatemono_Jutaku=" + dbBukken_Tatemono_Jutaku +
                ", dbBukken_Tatemono_HiJutaku=" + dbBukken_Tatemono_HiJutaku +
                ", dbBukken_Kozo='" + dbBukken_Kozo + '\'' +
                ", dbBukken_TatekataKodateKeishiki='" + dbBukken_TatekataKodateKeishiki + '\'' +
                ", dbNyukyoYoteiDateYear='" + dbNyukyoYoteiDateYear + '\'' +
                ", dbNyukyoYoteiDateMonth='" + dbNyukyoYoteiDateMonth + '\'' +
                ", dbJutakuYoto='" + dbJutakuYoto + '\'' +
                ", dbBukken_KojiKanryoDate_Year='" + dbBukken_KojiKanryoDate_Year + '\'' +
                ", dbBukken_KojiKanryoDate_Month='" + dbBukken_KojiKanryoDate_Month + '\'' +
                ", dbShikinDateTochiShikinYear='" + dbShikinDateTochiShikinYear + '\'' +
                ", dbShikinDateTochiShikinMonth='" + dbShikinDateTochiShikinMonth + '\'' +
                ", dbShikinDateChukanShikinYear='" + dbShikinDateChukanShikinYear + '\'' +
                ", dbShikinDateChukanShikinMonth='" + dbShikinDateChukanShikinMonth + '\'' +
                ", dbShikinDateSaishuShikinYear='" + dbShikinDateSaishuShikinYear + '\'' +
                ", dbShikinDateSaishuShikinMonth='" + dbShikinDateSaishuShikinMonth + '\'' +
                ", dbKariireIninKaishaName='" + dbKariireIninKaishaName + '\'' +
                ", dbChukaiHanbaiNameKana='" + dbChukaiHanbaiNameKana + '\'' +
                ", dbChukaiHanbaiTantoshaNameMei='" + dbChukaiHanbaiTantoshaNameMei + '\'' +
                ", dbChukaiHanbaiTantoshaNameSei='" + dbChukaiHanbaiTantoshaNameSei + '\'' +
                ", dbHiyouKensetsuHi=" + dbHiyouKensetsuHi +
                ", dbHiyouTochiSyotokuHi=" + dbHiyouTochiSyotokuHi +
                ", dbHiyouTotal=" + dbHiyouTotal +
                ", dbKariireGakuKingaku=" + dbKariireGakuKingaku +
                ", dbKariireGakuKinri=" + dbKariireGakuKinri +
                ", dbKariireGakuHensaiKikan=" + dbKariireGakuHensaiKikan +
                ", dbKariireGakuNenHensai12No1=" + dbKariireGakuNenHensai12No1 +
                ", dbHensaiHouhou='" + dbHensaiHouhou + '\'' +
                ", dbHisaiShinzokuDokyoAri='" + dbHisaiShinzokuDokyoAri + '\'' +
                ", dbSueokiKikanNoNensu='" + dbSueokiKikanNoNensu + '\'' +
                ", dbSonotaName='" + dbSonotaName + '\'' +
                ", dbSonotaKingaku=" + dbSonotaKingaku +
                ", dbSonotaHensaiKikan=" + dbSonotaHensaiKikan +
                ", dbSonotaNenHensai12No1=" + dbSonotaNenHensai12No1 +
                ", dbSogoKingaku=" + dbSogoKingaku +
                ", dbKinyuKikanName='" + dbKinyuKikanName + '\'' +
                ", dbShitemName='" + dbShitemName + '\'' +
                '}';
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getDbHisaijutakuShurui() {
        return dbHisaijutakuShurui;
    }

    public void setDbHisaijutakuShurui(String dbHisaijutakuShurui) {
        this.dbHisaijutakuShurui = dbHisaijutakuShurui;
    }

    public String getDbHisaijutakuShoyuu() {
        return dbHisaijutakuShoyuu;
    }

    public void setDbHisaijutakuShoyuu(String dbHisaijutakuShoyuu) {
        this.dbHisaijutakuShoyuu = dbHisaijutakuShoyuu;
    }

    public String getDbHigaiJokyo() {
        return dbHigaiJokyo;
    }

    public void setDbHigaiJokyo(String dbHigaiJokyo) {
        this.dbHigaiJokyo = dbHigaiJokyo;
    }

    public String getDbHigaiJokyoDaikiboHankaiOrHankai() {
        return dbHigaiJokyoDaikiboHankaiOrHankai;
    }

    public void setDbHigaiJokyoDaikiboHankaiOrHankai(String dbHigaiJokyoDaikiboHankaiOrHankai) {
        this.dbHigaiJokyoDaikiboHankaiOrHankai = dbHigaiJokyoDaikiboHankaiOrHankai;
    }

    public BigDecimal getDbBukken_Menseki() {
        return dbBukken_Menseki;
    }

    public void setDbBukken_Menseki(BigDecimal dbBukken_Menseki) {
        this.dbBukken_Menseki = dbBukken_Menseki;
    }

    public String getAplBukkenAddressTodofuken() {
        return aplBukkenAddressTodofuken;
    }

    public void setAplBukkenAddressTodofuken(String aplBukkenAddressTodofuken) {
        this.aplBukkenAddressTodofuken = aplBukkenAddressTodofuken;
    }

    public String getDbBukkenAddressShigun() {
        return dbBukkenAddressShigun;
    }

    public void setDbBukkenAddressShigun(String dbBukkenAddressShigun) {
        this.dbBukkenAddressShigun = dbBukkenAddressShigun;
    }

    public String getDbBukkenAddressChoson() {
        return dbBukkenAddressChoson;
    }

    public void setDbBukkenAddressChoson(String dbBukkenAddressChoson) {
        this.dbBukkenAddressChoson = dbBukkenAddressChoson;
    }

    public String getAplBukkenAddressBanchi() {
        return aplBukkenAddressBanchi;
    }

    public void setAplBukkenAddressBanchi(String aplBukkenAddressBanchi) {
        this.aplBukkenAddressBanchi = aplBukkenAddressBanchi;
    }

    public String getAplBukkenAddressPostCode3() {
        return aplBukkenAddressPostCode3;
    }

    public void setAplBukkenAddressPostCode3(String aplBukkenAddressPostCode3) {
        this.aplBukkenAddressPostCode3 = aplBukkenAddressPostCode3;
    }

    public String getDbBousaiSyudanItenJigyo() {
        return dbBousaiSyudanItenJigyo;
    }

    public void setDbBousaiSyudanItenJigyo(String dbBousaiSyudanItenJigyo) {
        this.dbBousaiSyudanItenJigyo = dbBousaiSyudanItenJigyo;
    }

    public String getDbBukkenShikichiNoShoyuKankei() {
        return dbBukkenShikichiNoShoyuKankei;
    }

    public void setDbBukkenShikichiNoShoyuKankei(String dbBukkenShikichiNoShoyuKankei) {
        this.dbBukkenShikichiNoShoyuKankei = dbBukkenShikichiNoShoyuKankei;
    }

    public BigDecimal getDbBukken_Tatemono_Jutaku() {
        return dbBukken_Tatemono_Jutaku;
    }

    public void setDbBukken_Tatemono_Jutaku(BigDecimal dbBukken_Tatemono_Jutaku) {
        this.dbBukken_Tatemono_Jutaku = dbBukken_Tatemono_Jutaku;
    }

    public BigDecimal getDbBukken_Tatemono_HiJutaku() {
        return dbBukken_Tatemono_HiJutaku;
    }

    public void setDbBukken_Tatemono_HiJutaku(BigDecimal dbBukken_Tatemono_HiJutaku) {
        this.dbBukken_Tatemono_HiJutaku = dbBukken_Tatemono_HiJutaku;
    }

    public String getDbBukken_Kozo() {
        return dbBukken_Kozo;
    }

    public void setDbBukken_Kozo(String dbBukken_Kozo) {
        this.dbBukken_Kozo = dbBukken_Kozo;
    }

    public String getDbBukken_TatekataKodateKeishiki() {
        return dbBukken_TatekataKodateKeishiki;
    }

    public void setDbBukken_TatekataKodateKeishiki(String dbBukken_TatekataKodateKeishiki) {
        this.dbBukken_TatekataKodateKeishiki = dbBukken_TatekataKodateKeishiki;
    }

    public String getDbNyukyoYoteiDateYear() {
        return dbNyukyoYoteiDateYear;
    }

    public void setDbNyukyoYoteiDateYear(String dbNyukyoYoteiDateYear) {
        this.dbNyukyoYoteiDateYear = dbNyukyoYoteiDateYear;
    }

    public String getDbNyukyoYoteiDateMonth() {
        return dbNyukyoYoteiDateMonth;
    }

    public void setDbNyukyoYoteiDateMonth(String dbNyukyoYoteiDateMonth) {
        this.dbNyukyoYoteiDateMonth = dbNyukyoYoteiDateMonth;
    }

    public String getDbJutakuYoto() {
        return dbJutakuYoto;
    }

    public void setDbJutakuYoto(String dbJutakuYoto) {
        this.dbJutakuYoto = dbJutakuYoto;
    }

    public String getDbBukken_KojiKanryoDate_Year() {
        return dbBukken_KojiKanryoDate_Year;
    }

    public void setDbBukken_KojiKanryoDate_Year(String dbBukken_KojiKanryoDate_Year) {
        this.dbBukken_KojiKanryoDate_Year = dbBukken_KojiKanryoDate_Year;
    }

    public String getDbBukken_KojiKanryoDate_Month() {
        return dbBukken_KojiKanryoDate_Month;
    }

    public void setDbBukken_KojiKanryoDate_Month(String dbBukken_KojiKanryoDate_Month) {
        this.dbBukken_KojiKanryoDate_Month = dbBukken_KojiKanryoDate_Month;
    }

    public String getDbShikinDateTochiShikinYear() {
        return dbShikinDateTochiShikinYear;
    }

    public void setDbShikinDateTochiShikinYear(String dbShikinDateTochiShikinYear) {
        this.dbShikinDateTochiShikinYear = dbShikinDateTochiShikinYear;
    }

    public String getDbShikinDateTochiShikinMonth() {
        return dbShikinDateTochiShikinMonth;
    }

    public void setDbShikinDateTochiShikinMonth(String dbShikinDateTochiShikinMonth) {
        this.dbShikinDateTochiShikinMonth = dbShikinDateTochiShikinMonth;
    }

    public String getDbShikinDateChukanShikinYear() {
        return dbShikinDateChukanShikinYear;
    }

    public void setDbShikinDateChukanShikinYear(String dbShikinDateChukanShikinYear) {
        this.dbShikinDateChukanShikinYear = dbShikinDateChukanShikinYear;
    }

    public String getDbShikinDateChukanShikinMonth() {
        return dbShikinDateChukanShikinMonth;
    }

    public void setDbShikinDateChukanShikinMonth(String dbShikinDateChukanShikinMonth) {
        this.dbShikinDateChukanShikinMonth = dbShikinDateChukanShikinMonth;
    }

    public String getDbShikinDateSaishuShikinYear() {
        return dbShikinDateSaishuShikinYear;
    }

    public void setDbShikinDateSaishuShikinYear(String dbShikinDateSaishuShikinYear) {
        this.dbShikinDateSaishuShikinYear = dbShikinDateSaishuShikinYear;
    }

    public String getDbShikinDateSaishuShikinMonth() {
        return dbShikinDateSaishuShikinMonth;
    }

    public void setDbShikinDateSaishuShikinMonth(String dbShikinDateSaishuShikinMonth) {
        this.dbShikinDateSaishuShikinMonth = dbShikinDateSaishuShikinMonth;
    }

    public String getDbKariireIninKaishaName() {
        return dbKariireIninKaishaName;
    }

    public void setDbKariireIninKaishaName(String dbKariireIninKaishaName) {
        this.dbKariireIninKaishaName = dbKariireIninKaishaName;
    }

    public String getDbChukaiHanbaiNameKana() {
        return dbChukaiHanbaiNameKana;
    }

    public void setDbChukaiHanbaiNameKana(String dbChukaiHanbaiNameKana) {
        this.dbChukaiHanbaiNameKana = dbChukaiHanbaiNameKana;
    }

    public String getDbChukaiHanbaiTantoshaNameMei() {
        return dbChukaiHanbaiTantoshaNameMei;
    }

    public void setDbChukaiHanbaiTantoshaNameMei(String dbChukaiHanbaiTantoshaNameMei) {
        this.dbChukaiHanbaiTantoshaNameMei = dbChukaiHanbaiTantoshaNameMei;
    }

    public String getDbChukaiHanbaiTantoshaNameSei() {
        return dbChukaiHanbaiTantoshaNameSei;
    }

    public void setDbChukaiHanbaiTantoshaNameSei(String dbChukaiHanbaiTantoshaNameSei) {
        this.dbChukaiHanbaiTantoshaNameSei = dbChukaiHanbaiTantoshaNameSei;
    }

    public BigDecimal getDbHiyouKensetsuHi() {
        return dbHiyouKensetsuHi;
    }

    public void setDbHiyouKensetsuHi(BigDecimal dbHiyouKensetsuHi) {
        this.dbHiyouKensetsuHi = dbHiyouKensetsuHi;
    }

    public BigDecimal getDbHiyouTochiSyotokuHi() {
        return dbHiyouTochiSyotokuHi;
    }

    public void setDbHiyouTochiSyotokuHi(BigDecimal dbHiyouTochiSyotokuHi) {
        this.dbHiyouTochiSyotokuHi = dbHiyouTochiSyotokuHi;
    }

    public BigDecimal getDbHiyouTotal() {
        return dbHiyouTotal;
    }

    public void setDbHiyouTotal(BigDecimal dbHiyouTotal) {
        this.dbHiyouTotal = dbHiyouTotal;
    }

    public BigDecimal getDbKariireGakuKingaku() {
        return dbKariireGakuKingaku;
    }

    public void setDbKariireGakuKingaku(BigDecimal dbKariireGakuKingaku) {
        this.dbKariireGakuKingaku = dbKariireGakuKingaku;
    }

    public BigDecimal getDbKariireGakuKinri() {
        return dbKariireGakuKinri;
    }

    public void setDbKariireGakuKinri(BigDecimal dbKariireGakuKinri) {
        this.dbKariireGakuKinri = dbKariireGakuKinri;
    }

    public BigDecimal getDbKariireGakuHensaiKikan() {
        return dbKariireGakuHensaiKikan;
    }

    public void setDbKariireGakuHensaiKikan(BigDecimal dbKariireGakuHensaiKikan) {
        this.dbKariireGakuHensaiKikan = dbKariireGakuHensaiKikan;
    }

    public BigDecimal getDbKariireGakuNenHensai12No1() {
        return dbKariireGakuNenHensai12No1;
    }

    public void setDbKariireGakuNenHensai12No1(BigDecimal dbKariireGakuNenHensai12No1) {
        this.dbKariireGakuNenHensai12No1 = dbKariireGakuNenHensai12No1;
    }

    public String getDbHensaiHouhou() {
        return dbHensaiHouhou;
    }

    public void setDbHensaiHouhou(String dbHensaiHouhou) {
        this.dbHensaiHouhou = dbHensaiHouhou;
    }

    public String getDbHisaiShinzokuDokyoAri() {
        return dbHisaiShinzokuDokyoAri;
    }

    public void setDbHisaiShinzokuDokyoAri(String dbHisaiShinzokuDokyoAri) {
        this.dbHisaiShinzokuDokyoAri = dbHisaiShinzokuDokyoAri;
    }

    public String getDbSueokiKikanNoNensu() {
        return dbSueokiKikanNoNensu;
    }

    public void setDbSueokiKikanNoNensu(String dbSueokiKikanNoNensu) {
        this.dbSueokiKikanNoNensu = dbSueokiKikanNoNensu;
    }

    public String getDbSonotaName() {
        return dbSonotaName;
    }

    public void setDbSonotaName(String dbSonotaName) {
        this.dbSonotaName = dbSonotaName;
    }

    public BigDecimal getDbSonotaKingaku() {
        return dbSonotaKingaku;
    }

    public void setDbSonotaKingaku(BigDecimal dbSonotaKingaku) {
        this.dbSonotaKingaku = dbSonotaKingaku;
    }

    public BigDecimal getDbSonotaHensaiKikan() {
        return dbSonotaHensaiKikan;
    }

    public void setDbSonotaHensaiKikan(BigDecimal dbSonotaHensaiKikan) {
        this.dbSonotaHensaiKikan = dbSonotaHensaiKikan;
    }

    public BigDecimal getDbSonotaNenHensai12No1() {
        return dbSonotaNenHensai12No1;
    }

    public void setDbSonotaNenHensai12No1(BigDecimal dbSonotaNenHensai12No1) {
        this.dbSonotaNenHensai12No1 = dbSonotaNenHensai12No1;
    }

    public BigDecimal getDbSogoKingaku() {
        return dbSogoKingaku;
    }

    public void setDbSogoKingaku(BigDecimal dbSogoKingaku) {
        this.dbSogoKingaku = dbSogoKingaku;
    }

    public String getDbKinyuKikanName() {
        return dbKinyuKikanName;
    }

    public void setDbKinyuKikanName(String dbKinyuKikanName) {
        this.dbKinyuKikanName = dbKinyuKikanName;
    }

    public String getDbShitemName() {
        return dbShitemName;
    }

    public void setDbShitemName(String dbShitemName) {
        this.dbShitemName = dbShitemName;
    }
}
