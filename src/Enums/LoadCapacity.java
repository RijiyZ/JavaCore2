package Enums;

public enum LoadCapacity {
    N1(0.0f, 3.5f),
    N2(3.5f, 12.0f),
    N3(12.0f, null);

    private Float from;
    private Float to;

    LoadCapacity(Float from, Float to) {
        this.from = from;
        this.to = to;
    }

    public Float getFrom() {
        return from;
    }

    public void setFrom(Float from) {
        this.from = from;
    }

    public Float getTo() {
        return to;
    }

    public void setTo(Float to) {
        this.to = to;
    }

    @Override
    public String toString() {
        if (getTo() != null) {
            return "Грузоподъемность от " + getFrom() + " тн до " + getTo() + " тн";
        } else {
            return "Грузоподъемность от " + getFrom() + " тн";
        }
    }
}