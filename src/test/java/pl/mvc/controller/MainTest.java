package pl.mvc.controller;

class MainTest {
    public static void main(String[] args) {
      shouldDisplayMenu();
    }
    static void shouldDisplayMenu() {
        pl.mvc.controller.Controller controller = new pl.mvc.controller.Controller();
        controller.start();

    }


}