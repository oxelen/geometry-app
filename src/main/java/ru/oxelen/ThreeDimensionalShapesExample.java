package ru.oxelen;

import ru.oxelen.shapes.Cube;
import ru.oxelen.shapes.Sphere;
import ru.oxelen.shapes.ThreeDimensionalShape;

public class ThreeDimensionalShapesExample {
    public static void main(String[] args) {
        //Three dim shapes v 1.0.0-SNAPSHOT
        checkCube();
        checkSphere();
    }

    static void checkCube() {
        double side = 5;
        ThreeDimensionalShape cube = new Cube(side);

        System.out.printf("""
                Cube side = %.2f,
                Volume: %.2f
                Area: %.2f
                
                """,
                side, cube.getVolume(), cube.getArea()
                );
    }

    static void checkSphere() {
        double radius = 6;
        ThreeDimensionalShape sphere = new Sphere(radius);

        System.out.printf("""
                Sphere radius = %.2f,
                Volume: %.2f
                Area: %.2f
                
                """,
                radius, sphere.getVolume(), sphere.getArea()
                );
    }
}
