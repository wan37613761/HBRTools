package com.wan3761.GameObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wan3761
 * @date 2025/6/15
 * @apiNote
 */

public class GameCharacter {
    private int id;
    private String label;
    private String name;
    private String ruby;
    private String team;
    private GameCharacterProfile profile;
    private List<GameStyleCard> cards;

    private final List<String> cardLabels = new ArrayList<>();

    public List<GameStyleCard> getCards() {
        return cards;
    }

    public void setCards(List<GameStyleCard> cards) {
        for (GameStyleCard c : cards){
            cardLabels.add(c.getLabel());
        }
        this.cards=cards;
    }

    public GameCharacterProfile getProfile() {
        return profile;
    }

    public void setProfile(GameCharacterProfile profile) {
        this.profile = profile;
    }

    public GameCharacter() {
    }

    public GameCharacter(int id, String label, String name, String ruby, String team, GameCharacterProfile profile) {
        this.id = id;
        this.label = label;
        this.name = name;
        this.ruby = ruby;
        this.team = team;
        this.profile = profile;
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

    public String getRuby() {
        return ruby;
    }

    public void setRuby(String ruby) {
        this.ruby = ruby;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", name='" + name + '\'' +
                ", ruby='" + ruby + '\'' +
                ", team='" + team + '\'' +
                ", profile=" + profile +
                ", cardLabels=" + cardLabels +
                '}';
    }
}
