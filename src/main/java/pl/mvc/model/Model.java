package pl.mvc.model;

public class Model {
    public double calculateCircleField(Circle circle){
        double field = Math.PI * circle.getR();
        return field;
    }
}
