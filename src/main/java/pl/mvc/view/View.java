package pl.mvc.view;

import pl.mvc.model.Circle;

public interface View {
    MenuOption showMenuAndGetOption();

    Circle promptForCircleParameters();

    void showCircleField(double circleField);
}
