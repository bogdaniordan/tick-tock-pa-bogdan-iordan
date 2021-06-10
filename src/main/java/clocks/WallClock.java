package clocks;

import java.sql.Time;

public class WallClock extends Clock{
    public WallClock(SpeedType speed, String sound, Time time) {
        super(speed, sound, time);
    }
}
