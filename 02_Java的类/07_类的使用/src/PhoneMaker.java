public class PhoneMaker {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.hasFigurePrintlocker = true;
        phone.price = 1999;
        phone.screen = new Screen();

        phone.screen.producer = "京东方";
        phone.screen.size = 8.8;

        CPU cpu = new CPU();
        cpu.producer = "三星";
        cpu.speed = 3.5;

        Memory memory = new Memory();
        memory.producer = "三星";
        memory.capacity = 4;

        Storage storage = new Storage();
        storage.capacity = 128;
        storage.producer = "Intel";

        phone.mainBoard = new MainBoard();

        phone.mainBoard.cpu = cpu;
        phone.mainBoard.memory = memory;
        phone.mainBoard.modol = "EA88";
        phone.mainBoard.storage = storage;
        phone.mainBoard.year = 2019;

        phone.prePhone =new Phone();

    }
}
