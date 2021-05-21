package pl.mvc.view;

import pl.mvc.model.Circle;
import pl.mvc.model.Cuboid;

public interface View {
    MenuOption showMenuAndGetOption();

    Circle promptForCircleParameters();
    void showCircleField(double circleField);

    Cuboid promptForCuboidParameters();
    void showCuboidVolume(double cuboidVolume);
}
