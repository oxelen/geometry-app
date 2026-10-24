package ru.oxelen;

import ru.oxelen.geometry.utils.GeometryUtils;
import ru.oxelen.geometry.utils.Units;

public class GeometryUtilsExample {
    public static void main(String[] args) {
        //Версия GeometryUtils 1.0.0
        checkAreaEquals();
        checkConvertUnits();
    }

    static void checkAreaEquals() {
        double radius = 5;

        Figure c1 = new Circle(radius);
        Figure c2 = new Circle(radius);

        System.out.printf("""
                Radius 1 = %.2f; Radius 2 = %.2f
                Is Areas equals: %b
                
                """, radius, radius, GeometryUtils.isAreaEquals(c1, c2));

        double a = 3;
        double b = 4;
        double c = 5;

        double width = 2;
        double length = 3;

        Figure t1 = new Triangle(a, b, c);
        Figure r1 = new Rectangle(width, length);

        System.out.printf("""
                Triangle: %.2f, %.2f, %.2f, area: %.2f;
                Rectangle: %.2f, %.2f, area: %.2f;
                Is Areas equals: %b
                
                """, a, b, c, t1.getArea(), width, length, r1.getArea(), GeometryUtils.isAreaEquals(t1, r1));

        System.out.printf("""
                Triangle: %.2f, %.2f, %.2f, area: %.2f;
                Circle radius: %.2f, area: %.2f;
                Is Areas equals: %b
                
                """, a, b, c, t1.getArea(), radius, c1.getArea(), GeometryUtils.isAreaEquals(t1, c1));
    }

    static void checkConvertUnits() {
        double inputVal = 5;

        System.out.printf("""
                %.2f cm to m is: %.2f
                
                """, inputVal, GeometryUtils.convert(inputVal, Units.CENTIMETER, Units.METER));
    }
}
