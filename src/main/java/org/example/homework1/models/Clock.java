package org.example.homework1.models;

import org.example.homework1.interfaces.Readable;

public class Clock implements Readable {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours % 24;
        this.minutes = minutes % 60;
        this.seconds = seconds % 60;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
        }
        if (minutes >= 60) {
            minutes = 0;
            hours++;
        }
        if (hours >= 24) {
            hours = 0;
        }
    }

    @Override
    public void readTime() {
        System.out.printf("Current time: %02d:%02d:%02d%n", hours, minutes, seconds);
    }
}
