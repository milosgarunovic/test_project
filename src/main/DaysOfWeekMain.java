package main;

import classes.DayOfWeek;

public class DaysOfWeekMain {

    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
        print(monday);
    }

    public static void print(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("THURSDAY");
                break;
            case FRIDAY:
                System.out.println("FRIDAY");
                break;
            case SATURDAY:
                System.out.println("SATURDAY");
                break;
            case SUNDAY:
                System.out.println("SUNDAY");
                break;
        }
    }
}
