package clocks;

public class Time {

    private int hour;

    private int minute;

    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time getTimeDifference(Time toTime) {
        int seconds = toTime.second - this.second;
        int minutes = toTime.minute - this.minute;
        int hours = toTime.hour - this.hour;
        return new Time(hours, minutes, seconds);
    }

}
