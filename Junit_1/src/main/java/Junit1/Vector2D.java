package Junit1;

public class Vector2D {
    private double x;// нули по умолчанию
    private double y;

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

    public double length(){// будем получать длину нашего вектора
        return Math.sqrt(x * x + y * y);// корень квадрата катетов

    }
}
