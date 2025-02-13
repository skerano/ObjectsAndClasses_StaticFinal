public final class Storage {
    private final StorageType storage; // тип (HDD, SSD)
    private final int capacity; // объём памяти
    private final double weight; // вес


    public Storage(StorageType storage, int capacity, double weight) {
        this.storage = storage;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String toString() {
        return "Хранилище: " + "\n" + "Тип: " + storage + "\n" +
                "Объем памяти: " + capacity + "\n" +
                "Вес: " + weight + "\n";
    }
    // Геттеры

    public StorageType getStorage() {
        return storage;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }
}
