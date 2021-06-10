package clocks;

import java.sql.Time;

public class AlarmClock extends Clock {
    private Time alarmTime;

    public AlarmClock(SpeedType speed, String sound, Time time, Time alarmTime) {
        super(speed, sound, time);
        this.alarmTime = alarmTime;
    }

    public Time getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Time alarmTime) {
        this.alarmTime = alarmTime;
    }

}
