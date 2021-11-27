module dev.vinca.learn.mavenjigsaw.impl {
    requires dev.vinca.learn.mavenjigsaw.spi;
    provides dev.vinca.learn.mavenjigsaw.service.DiceService with dev.vinca.learn.mavenjigsal.impl.RandomDiceService;
}