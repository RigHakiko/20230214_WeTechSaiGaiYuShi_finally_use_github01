package com.wetech.zhy.entity;

import java.time.LocalDate;

public class KoJinJoHoZhy {
    // Id
    private Integer Id;
    //姓（漢字）
    private String cpNamesei;
    // 名（漢字）
    private String cpNamemei;
    // セイ
    private String cpNameseikana;
    // メイ
    private String cpNamemeikana;
    // 姓（ローマ字）
    private String cuAlphlastname;
    // 名（ローマ字）
    private String cuAlphfirstname;
    // 国籍
    private String cpCountry;
    // 生年月日
    private LocalDate cpBirthdate;
    // 性別
    private String cpSex;
    // 電話番号
    private String cpDenwa;
    // 携帯電話
    private String cpPhone;
    // 職業
    private String cpShokugyocode;
    // 勤務先
    private String cpKinmusakiname;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCpNamesei() {
        return cpNamesei;
    }

    public void setCpNamesei(String cpNamesei) {
        this.cpNamesei = cpNamesei;
    }

    public String getCpNamemei() {
        return cpNamemei;
    }

    public void setCpNamemei(String cpNamemei) {
        this.cpNamemei = cpNamemei;
    }

    public String getCpNameseikana() {
        return cpNameseikana;
    }

    public void setCpNameseikana(String cpNameseikana) {
        this.cpNameseikana = cpNameseikana;
    }

    public String getCpNamemeikana() {
        return cpNamemeikana;
    }

    public void setCpNamemeikana(String cpNamemeikana) {
        this.cpNamemeikana = cpNamemeikana;
    }

    public String getCuAlphlastname() {
        return cuAlphlastname;
    }

    public void setCuAlphlastname(String cuAlphlastname) {
        this.cuAlphlastname = cuAlphlastname;
    }

    public String getCuAlphfirstname() {
        return cuAlphfirstname;
    }

    public void setCuAlphfirstname(String cuAlphfirstname) {
        this.cuAlphfirstname = cuAlphfirstname;
    }

    public String getCpCountry() {
        return cpCountry;
    }

    public void setCpCountry(String cpCountry) {
        this.cpCountry = cpCountry;
    }

    public LocalDate getCpBirthdate() {
        return cpBirthdate;
    }

    public void setCpBirthdate(LocalDate cpBirthdate) {
        this.cpBirthdate = cpBirthdate;
    }

    public String getCpSex() {
        return cpSex;
    }

    public void setCpSex(String cpSex) {
        this.cpSex = cpSex;
    }

    public String getCpDenwa() {
        return cpDenwa;
    }

    public void setCpDenwa(String cpDenwa) {
        this.cpDenwa = cpDenwa;
    }

    public String getCpPhone() {
        return cpPhone;
    }

    public void setCpPhone(String cpPhone) {
        this.cpPhone = cpPhone;
    }

    public String getCpShokugyocode() {
        return cpShokugyocode;
    }

    public void setCpShokugyocode(String cpShokugyocode) {
        this.cpShokugyocode = cpShokugyocode;
    }

    public String getCpKinmusakiname() {
        return cpKinmusakiname;
    }

    public void setCpKinmusakiname(String cpKinmusakiname) {
        this.cpKinmusakiname = cpKinmusakiname;
    }

    @Override
    public String toString() {
        return "KoJinJoHoZhy{" +
                "Id=" + Id +
                ", cpNamesei='" + cpNamesei + '\'' +
                ", cpNamemei='" + cpNamemei + '\'' +
                ", cpNameseikana='" + cpNameseikana + '\'' +
                ", cpNamemeikara='" + cpNamemeikana + '\'' +
                ", cuAlphlastname='" + cuAlphlastname + '\'' +
                ", cuAlphfirstname='" + cuAlphfirstname + '\'' +
                ", cpCountry='" + cpCountry + '\'' +
                ", cpBirthdate=" + cpBirthdate +
                ", cpSex='" + cpSex + '\'' +
                ", cpDenwa='" + cpDenwa + '\'' +
                ", cpPhone='" + cpPhone + '\'' +
                ", cpShokugyocode='" + cpShokugyocode + '\'' +
                ", cpKinmusakiname='" + cpKinmusakiname + '\'' +
                '}';
    }

    public KoJinJoHoZhy(String cpNamesei, String cpNamemei, String cpNameseikana, String cpNamemeikara, String cuAlphlastname, String cuAlphfirstname, String cpCountry, LocalDate cpBirthdate, String cpSex, String cpDenwa, String cpPhone, String cpShokugyocode, String cpKinmusakiname) {
        this.cpNamesei = cpNamesei;
        this.cpNamemei = cpNamemei;
        this.cpNameseikana = cpNameseikana;
        this.cpNamemeikana = cpNamemeikara;
        this.cuAlphlastname = cuAlphlastname;
        this.cuAlphfirstname = cuAlphfirstname;
        this.cpCountry = cpCountry;
        this.cpBirthdate = cpBirthdate;
        this.cpSex = cpSex;
        this.cpDenwa = cpDenwa;
        this.cpPhone = cpPhone;
        this.cpShokugyocode = cpShokugyocode;
        this.cpKinmusakiname = cpKinmusakiname;
    }

    public KoJinJoHoZhy() {
    }
}
