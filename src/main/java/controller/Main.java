package controller;

import clocks.*;

import java.sql.Time;

public class Main {

    public static void main(String [] args) {
        AlarmClock alarmClock = new AlarmClock(SpeedType.FAST, "BOOM!!!!", new Time(11,22,33), new Time(12, 0, 1));
        BigBen bigBen = BigBen.getInstance(SpeedType.SLOW, "BAM!!!", new Time(13, 59,50));
        WallClock wallClock = new WallClock(SpeedType.SLOW, "SKRRT!!!", new Time(16,0,0));
        ClockShop clockShop = new ClockShop();
        clockShop.addClock(alarmClock);
        clockShop.addClock(bigBen);
        clockShop.addClock(wallClock);
        clockShop.displayClocksState(13);
    }
}
