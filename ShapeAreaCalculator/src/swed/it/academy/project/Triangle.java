package swed.it.academy.project;

public class Triangle extends Shape {
    public Triangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
        double area = super.getArea()/2;
        super.setArea(area);
    }
}
