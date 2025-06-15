package com.wan3761.GameObjects;

import com.wan3761.GameObjects.enums.GameElement;
import com.wan3761.GameObjects.enums.GameRole;
import com.wan3761.GameObjects.enums.GameStyleTier;
import com.wan3761.GameObjects.enums.GameWeaponType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author wan3761
 * @date 2025/6/15
 * @apiNote
 */
public class GameStyleCard {
    private int id;
    private String label;
    private String name;
    private GameRole role;
    private GameStyleTier gameStyleTier;
    private GameWeaponType type;
    private GameElement[] ele;
    private Map<String,Integer> stats;
    private Map<String,String> gabi; // 成长技能
    private List<GameStyleSkill> skills;
    private List<GamePassiveSkill> passives;

    private final List<String> skillLabels = new ArrayList<>();
    private final List<String> passiveLabels = new ArrayList<>();

    public List<GamePassiveSkill> getPassives() {
        return passives;
    }

    public void setPassives(List<GamePassiveSkill> passives) {
        for (GamePassiveSkill p : passives){
            passiveLabels.add(p.getL());
        }
        this.passives = passives;
    }



    public GameStyleCard() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
}

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameRole getRole() {
        return role;
    }

    public void setRole(GameRole role) {
        this.role = role;
    }

    public GameStyleTier getGameStyleTier() {
        return gameStyleTier;
    }

    public void setGameStyleTier(GameStyleTier gameStyleTier) {
        this.gameStyleTier = gameStyleTier;
    }

    public GameWeaponType getType() {
        return type;
    }

    public void setType(GameWeaponType type) {
        this.type = type;
    }

    public GameElement[] getEle() {
        return ele;
    }

    public void setEle(GameElement[] ele) {
        this.ele = ele;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public void setStats(Map<String, Integer> stats) {
        this.stats = stats;
    }

    public Map<String, String> getGabi() {
        return gabi;
    }

    public void setGabi(Map<String, String> gabi) {
        this.gabi = gabi;
    }

    public List<GameStyleSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<GameStyleSkill> skills) {
        for (GameStyleSkill s : skills){
            skillLabels.add(s.getL());
        }
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "GameStyleCard{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", gameStyleTier=" + gameStyleTier +
                ", type=" + type +
                ", ele=" + Arrays.toString(ele) +
                ", stats=" + stats +
                ", gabi=" + gabi +
                ", skillLabels=" + skillLabels +
                ", passiveLabels=" + passiveLabels +
                '}';
    }
}
