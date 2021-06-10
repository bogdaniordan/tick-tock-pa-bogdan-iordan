package clocks;

import java.sql.Time;

public class WatchClock extends Clock{

    private final String color;

    public String getColor() {
        return color;
    }

    public WatchClock(SpeedType speed, String sound, Time time, String color) {
        super(speed, sound, time);
        this.color = color;
    }
}
