public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "XPS 15");

        Processor processor = new Processor(3200, 8,  "Ryzer", 3.2);
        Ram ram = new Ram ("DDR4", 16, 0.2);
        Screen screen = new Screen(15.6, DisplayType.IPS, 0.5);
        Keyboard keyboard = new Keyboard("Mechanical", true, 0.1);
        Storage storage = new Storage(StorageType.SSD, 512,0.3);

        computer.setProcessor(processor);
        computer.setRam(ram);
        computer.setScreen(screen);
        computer.setKeyboard(keyboard);
        computer.setStorage(storage);
        System.out.println(computer);

        System.out.println("Количество компьютеров = " + Computer.getCount());
        System.out.println("Общий вес: " + computer.totalWeight());



    }
}