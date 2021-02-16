package com.sparta.kurtis.hobby;

import java.util.Calendar;

public class Gaming extends Hobby {
    private String platform;
    private String game;
    private String skill;


    public Gaming(String description, double hoursPerWeek, double costPerMonth, boolean isDoneAlone, float priority, String startDate, String console, String game, String skill) {
        super("gaming", description, hoursPerWeek, costPerMonth, isDoneAlone, priority, startDate);
        this.platform = console;
        this.game = game;
        this.skill = skill;

    }
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\nplatform: ").append(platform)
                .append("\ngame: ").append(game)
                .append("\nskill: ").append(skill)
                .toString();
    }
}
