public class Computer {
    private final String vendor; // производитель
    private final String name; // название
    private Processor processor;
    private Ram ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;
    private static int count = 0;

    public Computer(String vendor, String name) {
        this.name = name;
        this.vendor = vendor;
        count++;
    }
    public double totalWeight() {
        double weight = 0;
        if (processor != null) {
            weight += processor.getWeight();
        }
        if (ram != null) {
            weight += ram.getWeight();
        }
        if (storage != null) {
            weight += storage.getWeight();
        }
        if (screen != null) {
            weight += screen.getWeight();
        }
        if (keyboard != null) {
            weight += keyboard.getWeight();
        }
        return weight;
    }

    public static int getCount() {
        return count;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public String toString() {
        return "Компьютер" + "\n" +
                "Производитель: " + vendor + "\n" +
                "Название: " + name + "\n" +
                "\n" + (processor != null ? processor : "не установлен") + "\n" +
                (ram != null ? ram : "не установлена") + "\n" +
                 (storage != null ? storage : "не установлено") + "\n" +
                 (screen != null ? screen : "не установлен") + "\n" +
                 (keyboard != null ? keyboard : "не установлена") + "\n";
    }

}
