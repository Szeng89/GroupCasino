package com.github.zipcodewilmington.casino.games.HeadsOrTails;

import com.github.zipcodewilmington.casino.games.coinflip.RNGCoin;
import com.github.zipcodewilmington.utils.IOConsole;

public class HeadsOrTails {
    private final IOConsole console = new IOConsole();
    RNGCoin coin = new RNGCoin();
    public int getPlayerGuess() {

        return console.getIntegerInput("Hello!! welcome to CoinFlip!" +
                "\n1. Heads" +
                "\n2. Tails" +
                "\nEnter a number:");
    }

    public int flipCoin() {
        return coin.coinRNG();
    }

    public boolean checkMatch(int playerGuess, int flipResult) {
        return playerGuess == flipResult;
    }
}
