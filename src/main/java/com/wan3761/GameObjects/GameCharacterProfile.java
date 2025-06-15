package com.wan3761.GameObjects;

/**
 * @author wan3761
 * @date 2025/6/15
 * @apiNote
 */
public class GameCharacterProfile{
    private String cv;
    private String vo;
    private String bd;  //birthday
    private String bp;  //place of birth
    private String hg;  //height
    private String sc;  //command of summon weapon(serafu)
    private String desc; //description

    @Override
    public String toString() {
        return "Profile{" +
                "cv='" + cv + '\'' +
                ", vo='" + vo + '\'' +
                ", bd='" + bd + '\'' +
                ", bp='" + bp + '\'' +
                ", hg='" + hg + '\'' +
                ", sc='" + sc + '\'' +
                ", desc='" + desc + '\'' +
                '}';

    }

    public GameCharacterProfile() {
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getVo() {
        return vo;
    }

    public void setVo(String vo) {
        this.vo = vo;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getHg() {
        return hg;
    }

    public void setHg(String hg) {
        this.hg = hg;
    }

    public String getSc() {
        return sc;
    }

    public void setSc(String sc) {
        this.sc = sc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public GameCharacterProfile(String cv, String vo, String bd, String bp, String hg, String sc, String desc) {
        this.cv = cv;
        this.vo = vo;
        this.bd = bd;
        this.bp = bp;
        this.hg = hg;
        this.sc = sc;
        this.desc = desc;
    }
}
