public final class Ram {
    private final String type; // тип
    private final int size; // объём
    private final double weight; // вес

    public Ram(String type, int size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public String toString() {
        return "Оперативная память: " + "\n" +
                "Тип: " + type + "\n" +
                "Объем: " + size + "\n" +
                "Вес: " + weight + "\n";
    }

    // Геттеры
    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }
}
