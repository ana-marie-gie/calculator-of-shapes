package pl.mvc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ModelTest {
    private Model model = new Model();

    @Test
    void shouldCalculateCircleField() {
        //given
        Circle circle = new Circle(1.0);
        //when
        double circleField = model.calculateCircleField(circle);
        //then
        assertEquals(Math.PI, circleField);
    }

    @Test
    void shouldCalculateCuboidVolume() {
        Cuboid cuboid = new Cuboid(1.0,2.0,3.0);
        double cuboidVolume = model.calculateCuboidVolume(cuboid);
        assertEquals(6.0, cuboidVolume);
    }


}