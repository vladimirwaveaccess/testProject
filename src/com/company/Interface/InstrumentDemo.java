package com.company.Interface;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar(7),
                new Drum(25),
                new Trumpet(15),
                new Guitar(6),
                new Drum(40),
                new Trumpet(35)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
