package com.company;

public class TeaCandy {
    public int teaParty(int tea, int candy) {

        int party = 0;

        if (tea < 5 || candy < 5){
            party = 0;
        } else if (tea >= 2*candy || candy >= 2*tea) {
            party = 2;
        } else if (tea >= 5 && candy >= 5) {
            party = 1;
        }

        return party;
    }
}
