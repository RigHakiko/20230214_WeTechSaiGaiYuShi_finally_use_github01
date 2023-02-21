package com.wetech.zhy.entity;

import java.time.LocalDate;

public class CollateralProviderZhy {
    private Integer id;
    private String cpTanpoMono;
    private String cpNameMei;
    private String cpNameMeiKana;
    private String cpNameSei;
    private String cpNameSeiKana;
    private LocalDate cpBirthDateYear;
    private String cpBirthDate;
    private String cpMoushikomi;
    private String cpRentaiSaimushaToOnaji;
    private String cpPhone;
    private String cpHonninShokugyoCode;
    private String cpHonninKinmusakiName;
    private String cpReason;
    private String cpSame;

    public CollateralProviderZhy() {
    }

    public CollateralProviderZhy(Integer id, String cpTanpoMono, String cpNameMei, String cpNameMeiKana, String cpNameSei, String cpNameSeiKana, LocalDate cpBirthDateYear, String cpBirthDate, String cpMoushikomi, String cpRentaiSaimushaToOnaji, String cpPhone, String cpHonninShokugyoCode, String cpHonninKinmusakiName, String cpReason, String cpSame) {
        this.id = id;
        this.cpTanpoMono = cpTanpoMono;
        this.cpNameMei = cpNameMei;
        this.cpNameMeiKana = cpNameMeiKana;
        this.cpNameSei = cpNameSei;
        this.cpNameSeiKana = cpNameSeiKana;
        this.cpBirthDateYear = cpBirthDateYear;
        this.cpBirthDate = cpBirthDate;
        this.cpMoushikomi = cpMoushikomi;
        this.cpRentaiSaimushaToOnaji = cpRentaiSaimushaToOnaji;
        this.cpPhone = cpPhone;
        this.cpHonninShokugyoCode = cpHonninShokugyoCode;
        this.cpHonninKinmusakiName = cpHonninKinmusakiName;
        this.cpReason = cpReason;
        this.cpSame = cpSame;
    }

    @Override
    public String toString() {
        return "CollateralProviderZhy{" +
                "id=" + id +
                ", cpTanpoMono='" + cpTanpoMono + '\'' +
                ", cpNameMei='" + cpNameMei + '\'' +
                ", cpNameMeiKana='" + cpNameMeiKana + '\'' +
                ", cpNameSei='" + cpNameSei + '\'' +
                ", cpNameSeiKana='" + cpNameSeiKana + '\'' +
                ", cpBirthDateYear=" + cpBirthDateYear +
                ", cpBirthDate='" + cpBirthDate + '\'' +
                ", cpMoushikomi='" + cpMoushikomi + '\'' +
                ", cpRentaiSaimushaToOnaji='" + cpRentaiSaimushaToOnaji + '\'' +
                ", cpPhone='" + cpPhone + '\'' +
                ", cpHonninShokugyoCode='" + cpHonninShokugyoCode + '\'' +
                ", cpHonninKinmusakiName='" + cpHonninKinmusakiName + '\'' +
                ", cpReason='" + cpReason + '\'' +
                ", cpSame='" + cpSame + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpTanpoMono() {
        return cpTanpoMono;
    }

    public void setCpTanpoMono(String cpTanpoMono) {
        this.cpTanpoMono = cpTanpoMono;
    }

    public String getCpNameMei() {
        return cpNameMei;
    }

    public void setCpNameMei(String cpNameMei) {
        this.cpNameMei = cpNameMei;
    }

    public String getCpNameMeiKana() {
        return cpNameMeiKana;
    }

    public void setCpNameMeiKana(String cpNameMeiKana) {
        this.cpNameMeiKana = cpNameMeiKana;
    }

    public String getCpNameSei() {
        return cpNameSei;
    }

    public void setCpNameSei(String cpNameSei) {
        this.cpNameSei = cpNameSei;
    }

    public String getCpNameSeiKana() {
        return cpNameSeiKana;
    }

    public void setCpNameSeiKana(String cpNameSeiKana) {
        this.cpNameSeiKana = cpNameSeiKana;
    }

    public LocalDate getCpBirthDateYear() {
        return cpBirthDateYear;
    }

    public void setCpBirthDateYear(LocalDate cpBirthDateYear) {
        this.cpBirthDateYear = cpBirthDateYear;
    }

    public String getCpBirthDate() {
        return cpBirthDate;
    }

    public void setCpBirthDate(String cpBirthDate) {
        this.cpBirthDate = cpBirthDate;
    }

    public String getCpMoushikomi() {
        return cpMoushikomi;
    }

    public void setCpMoushikomi(String cpMoushikomi) {
        this.cpMoushikomi = cpMoushikomi;
    }

    public String getCpRentaiSaimushaToOnaji() {
        return cpRentaiSaimushaToOnaji;
    }

    public void setCpRentaiSaimushaToOnaji(String cpRentaiSaimushaToOnaji) {
        this.cpRentaiSaimushaToOnaji = cpRentaiSaimushaToOnaji;
    }

    public String getCpPhone() {
        return cpPhone;
    }

    public void setCpPhone(String cpPhone) {
        this.cpPhone = cpPhone;
    }

    public String getCpHonninShokugyoCode() {
        return cpHonninShokugyoCode;
    }

    public void setCpHonninShokugyoCode(String cpHonninShokugyoCode) {
        this.cpHonninShokugyoCode = cpHonninShokugyoCode;
    }

    public String getCpHonninKinmusakiName() {
        return cpHonninKinmusakiName;
    }

    public void setCpHonninKinmusakiName(String cpHonninKinmusakiName) {
        this.cpHonninKinmusakiName = cpHonninKinmusakiName;
    }

    public String getCpReason() {
        return cpReason;
    }

    public void setCpReason(String cpReason) {
        this.cpReason = cpReason;
    }

    public String getCpSame() {
        return cpSame;
    }

    public void setCpSame(String cpSame) {
        this.cpSame = cpSame;
    }
}
