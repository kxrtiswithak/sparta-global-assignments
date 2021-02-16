package com.sparta.kurtis;

import com.sparta.kurtis.hobby.*;

import java.util.Calendar;
import java.util.Date;

public class Starter {
    private static Hobby FIFA;
    private static Hobby deathlyHallows;
    private static Hobby treadmill;
    private static Hobby premierLeague;

    public static void start() {
        createHobbies();
        printHobbies();
    }


    public static void createHobbies() {
        FIFA = new Gaming("the home of sweaty goals, rage quits, and unfulfilled career modes", 0.7, 3.33, true, 3, "27/11/2018", "PS4", "FIFA", "world class");

        deathlyHallows = new Reading("the final book of the harry potter franchise, defo better than the two drawn out movies", 2, 0, true, 5, "14/03/2013", "Harry Potter and The Deathly Hallows", "Fantasy", "J.K. Rowling", "Hardback book", 72, 589);

        treadmill = new Running("gotta do something with all this lockdown time, might as well hop on the treadmill here AND there (i do not actually own a treadmill, but pretend I do for the bit)", 3, 0, true, 8, "18/02/2008", new String[]{"treadmill", "running shoes", "fitness watch", "bluetooth headphones", "water", "phone"}, new String[][]{{"bed", "treadmill"}, {"treadmill", "bed"}}, "glutes like ronaldo");

        premierLeague = new WatchingSport("this season has definitely been one for the record books, from villa thrashing liverpool 7-2, to mnu walloping southampton 9-0, with there being much more drama to come", 3, 10, false, 5, "23/07/1997", "Sky Sports PL", "football", "Satellite TV", "Aston Villa");
    }

    public static void printHobbies() {
        Printer.printMessage(FIFA.toString());
        Printer.printMessage(deathlyHallows.toString());
        Printer.printMessage(treadmill.toString());
        Printer.printMessage(premierLeague.toString());
    }
}
