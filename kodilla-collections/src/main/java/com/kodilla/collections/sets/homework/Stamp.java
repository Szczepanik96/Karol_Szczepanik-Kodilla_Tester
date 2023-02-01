package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampSize;
    private boolean isItStamped;

    public Stamp(String stampName, double stampSize, boolean isItStamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.isItStamped = isItStamped;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampSize() {
        return stampSize;
    }

    public boolean isItStamped() {
        return isItStamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize=" + stampSize +
                ", isItStamped=" + isItStamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampSize, stampSize) == 0 && isItStamped == stamp.isItStamped && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, isItStamped);
    }
}
