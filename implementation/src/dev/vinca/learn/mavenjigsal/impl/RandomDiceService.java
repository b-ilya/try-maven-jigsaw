package dev.vinca.learn.mavenjigsal.impl;

import dev.vinca.learn.mavenjigsaw.Dice;
import dev.vinca.learn.mavenjigsaw.service.DiceService;

import java.util.Random;

public class RandomDiceService implements DiceService {
    @Override
    public Dice createDice(int sides) {
        var random = new Random();
        return new Dice() {
            @Override
            public int nextResult() {
                return random.nextInt(sides) + 1;
            }
        };
    }
}
