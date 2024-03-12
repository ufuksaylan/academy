package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hexagon extends Shape {
    private static final double HEXAGON_AREA_COEFFICIENT = 2.598076211353316;

    public Hexagon(double sideLength) {
        super(sideLength, sideLength);
    }

    @Override
    public void calculateArea() {
        super.rectangleArea();
        double hexagonArea = super.getArea() * HEXAGON_AREA_COEFFICIENT;
        BigDecimal area = new BigDecimal(hexagonArea);
        area = area.setScale(2, RoundingMode.UP);
        super.setArea(area.doubleValue());
    }
}