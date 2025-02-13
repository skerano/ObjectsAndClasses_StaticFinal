public final class Keyboard {
    private final String type; // тип
    private final boolean backlit; // наличие подсветки
    private final double weight; // вес

    public Keyboard(String type, boolean backlit, double weight) {
        this.type = type;
        this.backlit = backlit;
        this.weight = weight;
    }
    public String toString() {
        return "Клавиатура: " + "\n" + "Тип: " + type + "\n" +
                "Наличие подсветки: " + backlit + "\n" +
                "Вес: " + weight + "\n";
    }

    // Геттеры
    public String getType() {
        return type;
    }

    public boolean isBacklit() {
        return backlit;
    }

    public double getWeight() {
        return weight;
    }
}
