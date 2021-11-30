package dev.vinca.learn.mavenjigsaw.user;

import dev.vinca.learn.mavenjigsaw.Dice;
import dev.vinca.learn.mavenjigsaw.service.DiceService;

import java.util.ServiceLoader;

public class DiceGame {

    public static void main(String[] args) throws InterruptedException {
        new DiceGame().start();
    }

    private Dice dice;

    public DiceGame() {
        try {
            var serviceLoader = ServiceLoader.load(DiceService.class);
            this.dice = serviceLoader.findFirst().orElseThrow().createDice();
        } catch (Exception e) {
            System.err.println("Error during initialization: " + e.toString());
            e.printStackTrace(System.err);
        }
    }

    public void start() throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
            System.out.println("Throwing dice: ");
            System.out.println("result is  = " + dice.nextResult());
        }
    }

}
