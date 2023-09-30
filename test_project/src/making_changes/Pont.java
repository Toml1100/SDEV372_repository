package making_changes;

import java.util.Objects;

public class Pont {
    private double x;
    private double y;

    public Pont(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pont pont = (Pont) o;
        return Double.compare(x, pont.x) == 0 && Double.compare(y, pont.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Pont{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
