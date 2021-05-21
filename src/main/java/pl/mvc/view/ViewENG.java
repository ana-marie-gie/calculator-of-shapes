package pl.mvc.view;

import pl.mvc.model.Circle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewENG implements View {

    private Scanner scanner = new Scanner(System.in);

    private void log(String text) {
        System.out.println(text);
    }

    @Override
    public MenuOption showMenuAndGetOption() {
        log("Choose option: ");
        log("[" + MenuOption.CIRCLE_FIELD.menuIndex + "]" + " Count circle field");
        log("[" + MenuOption.CHANGE_LANGUAGE.menuIndex + "]" + " Change language to Polish");
        log("[" + MenuOption.EXIT.menuIndex + "]" + " Exit the application");

        int menuOption;

        try {
            menuOption = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next();
            log("Choose correct value from menu");
            return null;
        }
        return MenuOption.valueOf(menuOption);

    }

    @Override
    public Circle promptForCircleParameters() {
        log("Enter the radius length of the circle:  ");
        Double r = null;
        while (r == null) {
            try {
                r = scanner.nextDouble();
                Circle circle = new Circle(r);
                return circle;
            } catch (InputMismatchException e) {
                log("Enter a floating point value using a comma");
                scanner.next();
            }
        }
        return null;
    }

    @Override
    public void showCircleField(double circleField) {
        log("The area of the circle is: " + circleField);
    }
}
