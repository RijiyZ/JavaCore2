package Enums;

public enum Capacity {
    ESPEC_SMALL(0, 10),
    SMALL(10, 25),
    AVERAGE(40, 50),
    LARGE(60, 80),
    ESPEC_BIG(100, 120);

    // поля
    private final int from;
    private final int to;

    // конструктор
    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    // геттеры
    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Вместимость " + from + " - " + to + " мест";
    }

}