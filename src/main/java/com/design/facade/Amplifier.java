package com.design.facade;

public class Amplifier {
    public void on() {
        System.out.println("The Amplifier is on");
    }

    public void seDvd() {
        System.out.println("DVD is set");
    }

    public void setSurroundSound() {
        System.out.println("Set surround sound");
    }

    public void setVolume(int volume) {
        System.out.println("Volume is: " + volume);
    }

    public void off() {
        System.out.println("The amplifier is off");
    }
}
