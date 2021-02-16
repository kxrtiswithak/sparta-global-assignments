package com.sparta.kurtis.hobby;

import com.sparta.kurtis.Printer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class Hobby {
    public String name;
    public String description;
    public double hoursPerWeek;
    private double costPerMonth;
    private boolean isDoneAlone;
    private float priority;
    private Date startDate;

    public Hobby(String name, String description, double hoursPerWeek, double costPerMonth, boolean isDoneAlone, float priority, String startDate) {
        this.name = name;
        this.description = description;
        this.hoursPerWeek = hoursPerWeek;
        this.costPerMonth = costPerMonth;
        this.isDoneAlone = isDoneAlone;
        this.priority = priority;
        this.startDate = parseDate(startDate);
    }

    public String getName() {
        return name;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public double getCostPerMonth() {
        return costPerMonth;
    }

    public boolean isDoneAlone() {
        return isDoneAlone;
    }

    public float getPriority() {
        return priority;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        if (hoursPerWeek <= 0) {
            Printer.printErrorMessage("you might as well write it off, stop kidding yourself");
        }
        this.hoursPerWeek = hoursPerWeek;
    }

    public void setCostPerMonth(double costPerMonth) {
        if (costPerMonth < 0) {
            Printer.printErrorMessage("these are supposed to be hobbies, not business ventures smh");
        }
        this.costPerMonth = costPerMonth;
    }

    public void setPriority(float priority) {
        if (priority < 0 || priority > 10) {
            Printer.printErrorMessage("hold your horses sunshine, out of 10, it's really not that hard");
        }
        this.priority = priority;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                        .append("\nname: ").append(name)
                        .append("\ndescription: ").append(description)
                        .append("\nfrequency: ").append(hoursPerWeek).append(" hours a week")
                        .append("\nstart: ").append(formatDate(startDate))
                        .append("\ntotal hours: ").append(getHobbyHours())
                        .append("\nmonthly cost: £").append(costPerMonth)
                        .append("\ndone solitary: ").append(isDoneAlone)
                        .append("\npriority: ").append(priority).append("/10")
                        .toString();
    }

    public double getHobbyHours() {
        long daysSinceStart = (new Date().getTime() - startDate.getTime()) / (24 * 60 * 60 * 1000);

        return daysSinceStart * (hoursPerWeek / 7);
    }

    public void setDescription(String description) {
        this.description = description;
    };

    public String getDescription() {
        return description;
    }

    public static Date parseDate(String date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date newDate = null;
        try {
            newDate = formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newDate;
    }

    public static String formatDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("E dd MMM yyyy", Locale.ENGLISH);
        return formatter.format(date);
    }
}
