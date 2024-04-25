package com.design.command;

public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void setCd() {
        System.out.println(location + " stereo is set CD");
    }

    public void setDvd() {
        System.out.println(location + " stereo is set DVD");
    }

    public void setRadio() {
        System.out.println(location + " stereo is set radio");
    }

    public void setVolume(int value) {
        System.out.println(location + " volume is: " + value);
    }
}
