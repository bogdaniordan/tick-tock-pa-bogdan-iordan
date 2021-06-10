package clocks;

import clocks.Clock;

import java.util.ArrayList;
import java.util.List;

public class ClockShop {

    private final List<Clock> clockList;

    public ClockShop() {
        clockList = new ArrayList<>();
    }

    public void addClock(Clock clock) {
        clockList.add(clock);
    }

    public void displayClocksState(int seconds) {
        for (int i = 0; i < seconds; i++) {
            for (Clock clock: clockList) {
                clock.tickClock();
                System.out.println(clock.getTime().toString());
            }
        }
    }
}
