package com.wan3761.GameObjects;

import com.wan3761.GameObjects.enums.Ct;
import com.wan3761.GameObjects.enums.SkillElement;

import java.util.List;

/**
 * @author wan3761
 * @date 2025/6/15
 * @apiNote
 */
public class GameStyleSkill {
    private int i; //id
    private String l; //label
    private String n; //name
    private int c; //cost
    private Ct ct = Ct.SP; //cost type
    private int u = -1;// max uses
    private List<List<SkillElement>> e ; //skill elements

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Ct getCt() {
        return ct;
    }

    public void setCt(Ct ct) {
        this.ct = ct;
    }

    public int getU() {
        return u;
    }

    public void setU(int u) {
        this.u = u;
    }

    public List<List<SkillElement>> getE() {
        return e;
    }

    public void setE(List<List<SkillElement>> e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "GameStyleSkill{" +
                "i=" + i +
                ", l='" + l + '\'' +
                ", n='" + n + '\'' +
                ", c=" + c +
                ", ct=" + ct +
                ", u=" + u +
                ", e=" + e +
                '}';
    }
}
