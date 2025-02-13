public final class Processor {
    private final double frequency; // частота
    private final int cores; // количество ядер
    private final String manufacturer; // производитель
    private final double weight; // вес

    public Processor(double frequency, int cores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }
    public String toString() {
        return "Процессор: " + "\n" +
                "Частота: " + frequency + "\n" +
                "Кол-во ядер: " + cores + "\n" +
                "Производитель: " + manufacturer + "\n" +
                "Вес: " + weight + "\n";
    }

    // Геттеры
    public double getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

}