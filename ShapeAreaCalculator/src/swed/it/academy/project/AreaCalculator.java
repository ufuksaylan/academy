package swed.it.academy.project;

import java.util.InputMismatchException;

public class AreaCalculator {

    public static void main(String[] args) {
        runCalculator();
    }

    private static void runCalculator() {
        talkToUser();
        outputTheResult();
    }

    private static void talkToUser() {
        boolean validInput;
        do {
            validInput = true;
            InputOutputManager.printMenu();
            try {
                InputOutputManager.setShapeChoice();
            } catch (UnknownShapeException e) {
                System.out.println("Error: " + e.getMessage());
                validInput = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                InputOutputManager.scanner.nextLine(); // Clear the invalid input from the scanner
                validInput = false;
            }
        } while (!validInput);
    }

    private static void outputTheResult() {
        Shape shape = InputOutputManager.getShapeChoice();

        if (shape != null) {
            shape.calculateArea();
            InputOutputManager.showCalculatedArea(shape.toString());
        }
    }
}
