package swed.it.academy.project;

public abstract class Shape {
    private double area;
    private final double side1;
    private final double side2;

    public Shape(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public abstract void calculateArea();

    public void rectangleArea() {
        this.area = this.side1 * this.side2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
