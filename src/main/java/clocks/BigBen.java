package clocks;

import java.sql.Time;

public class BigBen extends Clock{
    private static BigBen instance = null;

    private BigBen(SpeedType speed, String sound, Time time) {
        super(speed, sound, time);
    }

    public static BigBen getInstance(SpeedType speed, String sound, Time time) {
        if (instance == null) {
            instance = new BigBen(speed, sound, time);
        }
        return instance;
    }
}
