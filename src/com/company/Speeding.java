package com.company;

public class Speeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {

        int ticket = 0;

        if (isBirthday == true){
            speed = speed - 5;
        }

        if (speed <= 60){
            ticket = 0;
        } else if(speed >=61 && speed <=80){
            ticket = 1;
        } else if (speed >= 81){
            ticket = 2;
        }
        return ticket;
    }

}
