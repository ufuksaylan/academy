package swed.it.academy.project;

import java.util.Scanner;

public class InputOutputManager {
    private static Shape shapeChoice;

    static final Scanner scanner = new Scanner(System.in);

    public static void printMenu() {
        System.out.println("Choose one the following shapes: (Type 1-3)");
        System.out.println("1- Square");
        System.out.println("2- Triangle");
        System.out.println("3- Circle");
        System.out.println("4- Hexagon");
    }

    public static void setShapeChoice() throws UnknownShapeException {
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter a value for square side: ");
                double side = scanner.nextDouble();
                shapeChoice = new Square(side);
                break;
            case 2:
                System.out.println("Enter a value for square side1: ");
                double side1 = scanner.nextDouble();

                System.out.println("Enter a value for square side1: ");
                double side2 = scanner.nextDouble();
                shapeChoice = new Triangle(side1, side2);
                break;
            case 3:
                System.out.println("Enter a value for the radius: ");
                double radius = scanner.nextDouble();

                shapeChoice = new Circle(radius);
                break;
            case 4:
                System.out.println("Enter a value for side of hexagon");
                double hexagonSide = scanner.nextDouble();
                shapeChoice = new Hexagon(hexagonSide);
                break;
            default:
                scanner.close();
                throw new UnknownShapeException("pizza and beers please");
        }
    }

    public static Shape getShapeChoice() {
        return shapeChoice;
    }

    public static void showCalculatedArea(String shapeRep) {
        System.out.println(shapeRep);
    }

}
