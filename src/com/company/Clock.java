package com.company;

import java.util.Objects;

public class Clock {
    private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void addOneMinute() {
        int minutes;
        minutes = hour * 60 + minute + 1;
        minute = minutes % 60;
        if (minutes % 60 == 0) {
            hour = hour + 1;
            if (hour >= 24) {
                hour = 0;
            }
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clock clock = (Clock) o;
        return hour == clock.hour &&
                minute == clock.minute;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute);
    }

    @Override
    public String toString() {
        if (minute < 10) {
            return "" + hour + ":0" + minute;
        } else {
            return hour + ":" + minute;
        }
    }
}
