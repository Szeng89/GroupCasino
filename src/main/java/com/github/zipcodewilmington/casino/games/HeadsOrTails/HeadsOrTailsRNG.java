package com.github.zipcodewilmington.casino.games.HeadsOrTails;

import java.util.Random;

public class HeadsOrTailsRNG {
    private int rngRange;

    public int coinRNG() {
        Random random = new Random();
        return 1 + random.nextInt(2);
    }
}