package pl.mvc.controller;

import pl.mvc.model.Circle;
import pl.mvc.model.Cuboid;
import pl.mvc.model.Model;
import pl.mvc.view.MenuOption;
import pl.mvc.view.View;
import pl.mvc.view.ViewENG;
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
                case CUBOID_VOLUME:
                    handleCuboidVolume();
                    break;
                case CHANGE_LANGUAGE:
                    handleLanguageChange();
                    continue;
            }
        } while (menuOption != MenuOption.EXIT);
    }

    private void handleCuboidVolume() {
        Cuboid cuboid = view.promptForCuboidParameters();
        double cuboidVolume = model.calculateCuboidVolume(cuboid);
        view.showCuboidVolume(cuboidVolume);
    }



    public void handleCircleFieldCalculate() {
        Circle circle = view.promptForCircleParameters();
        double circleField = model.calculateCircleField(circle);
        view.showCircleField(circleField);
    }
    private void handleLanguageChange() {
        if (view instanceof ViewPL) {
            view = new ViewENG();
        }else {
            view = new ViewPL();
        }
    }
}
