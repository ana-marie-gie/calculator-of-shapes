package pl.mvc.controller;

import pl.mvc.model.Circle;
import pl.mvc.model.Model;
import pl.mvc.view.MenuOption;
import pl.mvc.view.View;
import pl.mvc.view.ViewPL;

public class Controller {
    private View view;
    private Model model;

    public Controller() {
        view = new ViewPL();
        model = new Model();
    }

    public void start() {
        MenuOption menuOption;
        do {
            menuOption = view.showMenuAndGetOption();

            if (menuOption == null) {
                continue;
            }

            switch (menuOption) {

                case CIRCLE_FIELD:
                    handleCircleFieldCalculate();
                    break;

            }
        } while (menuOption != MenuOption.EXIT);
    }

    private void handleLanguageChange() {
        if (view instanceof ViewPL) {
            view = new ViewPL();
        }
    }

    public void handleCircleFieldCalculate() {
        Circle circle = view.promptForCircleParameters();
        double circleField = model.calculateCircleField(circle);
        view.showCircleField(circleField);
    }
}
