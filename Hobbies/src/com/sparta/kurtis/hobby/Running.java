package com.sparta.kurtis.hobby;

import com.sparta.kurtis.Printer;

import java.util.Arrays;

public class Running extends Hobby {
    private String[] equipment;
    private String[][] routes;
    private String goals;

    public Running(String description, double hoursPerWeek, double costPerMonth, boolean isDoneAlone, float priority, String startDate, String[] equipment, String[][] routes, String goals) {
        super("running", description, hoursPerWeek, costPerMonth, isDoneAlone, priority, startDate);
        this.equipment = equipment;
        this.routes = routes;
        this.goals = goals;
    }

    public String[] getEquipment() {
        return equipment;
    }

    public void setEquipment(String[] equipment) {
        this.equipment = equipment;
    }

    public String[][] getRoutes() {
        return routes;
    }

    public void setRoutes(String[][] routes) {
        this.routes = routes;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\nequipment: ").append(Arrays.toString(equipment))
                .append("\nroutes: ").append(Printer.getNestedStringArray(routes))
                .append("\ngoals: ").append(goals)
                .toString();
    }
}
