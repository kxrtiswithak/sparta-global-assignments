package com.sparta.kurtis.hobby;

import java.util.Calendar;
import java.util.Date;

public class WatchingSport extends Hobby {
    private String channel;
    private String sport;
    private String modeOfWatching;
    private String favouriteTeam;

    public WatchingSport(String description, double hoursPerWeek, double costPerMonth, boolean isDoneAlone, float priority, String startDate, String channel, String sport, String modeOfWatching, String favouriteTeam) {
        super("watching sport", description, hoursPerWeek, costPerMonth, isDoneAlone, priority, startDate);
        this.channel = channel;
        this.sport = sport;
        this.modeOfWatching = modeOfWatching;
        this.favouriteTeam = favouriteTeam;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(super.toString())
                .append("\nchannel: ").append(channel)
                .append("\nsport: ").append(sport)
                .append("\nmode of watching: ").append(modeOfWatching)
                .append("\nfavourite team: ").append(favouriteTeam)
                .toString();
    }
}
