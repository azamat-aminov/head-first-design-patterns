package com.design.facade;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD is on");
    }

    public void play(String movie) {
        System.out.println("DVD is playing: " + movie);
    }

    public void stop() {
        System.out.println("DVD is stopped");
    }

    public void eject() {
        System.out.println("DVD is ejected");
    }

    public void off() {
        System.out.println("DVD is off");
    }
}
