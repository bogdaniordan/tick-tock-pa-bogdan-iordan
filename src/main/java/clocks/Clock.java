package clocks;

import java.sql.Time;

public class Clock {
    private SpeedType speed;
    private String sound;
    private Time time;

    public Clock(SpeedType speed, String sound, Time time) {
        this.speed = speed;
        this.sound = sound;
        this.time = time;
    }

    public SpeedType getSpeed() {
        return speed;
    }

    public void setSpeed(SpeedType speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String makeSound() {
        return sound;
    }

    public void tickClock() {
        if (time.getMinutes() == 59 && time.getSeconds() == 59) {
            System.out.println(makeSound());
        }
        time.setSeconds(time.getSeconds() + 1);

    }
}
