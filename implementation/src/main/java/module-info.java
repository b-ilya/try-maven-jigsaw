module dev.vinca.learn_mavenjigsaw_impl {
    requires dev.vinca.learn_mavenjigsaw_spi;
    provides dev.vinca.learn.mavenjigsaw.service.DiceService with dev.vinca.learn.mavenjigsaw.impl.RandomDiceService;
}