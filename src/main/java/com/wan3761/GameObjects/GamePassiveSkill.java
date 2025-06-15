package com.wan3761.GameObjects;

import com.wan3761.GameObjects.enums.SkillElement;

import java.util.List;

/**
 * @author wan3761
 * @date 2025/6/15
 * @apiNote
 */

public class GamePassiveSkill {
    private int i; //id
    private String l; //lable
    private String n; //name
    @ToBeUnderstand private String s;
    private String c;// condition
    private String t;// timing
    private List<List<SkillElement>> e;

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

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public List<List<SkillElement>> getE() {
        return e;
    }

    public void setE(List<List<SkillElement>> e) {
        this.e = e;
    }
}
