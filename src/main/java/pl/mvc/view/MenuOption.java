package pl.mvc.view;

public enum MenuOption {
    EXIT(0),
    CIRCLE_FIELD(1);

    public int menuIndex;

    MenuOption(int menuIndex) {
        this.menuIndex = menuIndex;
    }

    public static MenuOption valueOf(int menuIndex) {
        for (MenuOption menuOption : values()) {
            if (menuIndex == menuOption.menuIndex) {
                return menuOption;
            }
        }
        return null;
    }
}
