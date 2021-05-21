package pl.mvc.view;

import pl.mvc.model.Circle;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewPL implements View{

    private Scanner scanner = new Scanner (System.in);

    private void log(String text){
        System.out.println(text);
    }
    @Override
    public MenuOption showMenuAndGetOption() {
        log("Wybierz opcję: ");
        log("[" + MenuOption.CIRCLE_FIELD.menuIndex + "]" + " Oblicz pole koła");

        log("[" + MenuOption.EXIT.menuIndex + "]" + " Wyjście z programu");

        int menuOption;

        try{
            menuOption = scanner.nextInt();
        }catch (InputMismatchException e){
            scanner.next();
            log("Wybierz poprawną wartość liczbową z listy opcji");
            return null;
        }
        return MenuOption.valueOf(menuOption);

    }

    @Override
    public Circle promptForCircleParameters() {
        log("Podaj długość promienia koła: ");
        double r = scanner.nextDouble();
        Circle circle = new Circle(r);
        return circle;
    }

    @Override
    public void showCircleField(double circleField) {
    log("Pole koła wynosi: " + circleField);
    }
}
