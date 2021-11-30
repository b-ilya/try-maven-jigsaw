package dev.vinca.learn.mavenjigsaw.service;

import dev.vinca.learn.mavenjigsaw.Dice;

public interface DiceService {
    int DEFAULT_DICE_FACES = 6;

    default Dice createDice() {
        return createDice(DEFAULT_DICE_FACES);

    }
    Dice createDice(int sides);
}