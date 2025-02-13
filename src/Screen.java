public final class Screen {
    private final double diagonal; // диагональ
    private final DisplayType display; // тип (IPS, TN, VA)
    private final double weight; // вес

    public Screen(double diagonal, DisplayType display, double weight) {
        this.diagonal = diagonal;
        this.display = display;
        this.weight = weight;
    }

    public String toString() {
        return "Экран: " + "\n" + "Диагональ: " + diagonal + "\n" +
                "Дисплей: " + display + "\n" +
                "Вес: " + weight + "\n";
    }

    // Геттеры
    public double getDiagonal() {
        return diagonal;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public double getWeight() {
        return weight;
    }
}
