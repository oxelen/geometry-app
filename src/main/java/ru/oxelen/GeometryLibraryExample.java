package ru.oxelen;

import ru.oxelen.exception.NotValidFigureParametersException;

public class GeometryLibraryExample {
    public static void main(String[] args) {
        //Версия GeometryLibrary 1.0.0
        printTriangle();
        System.out.println();

        printRectangle();
        System.out.println();

        printCircle();
        System.out.println();

        exceptionCheck();
        System.out.println();

        //Изменил версию GeometryLibrary на 1.1.0, где добавил метод boolean isSquare()
        checkIsSquare();
        System.out.println();
    }

    static void printTriangle() {
        double a = 2;
        double b = 3;
        double c = 4;

        Figure triangle = new Triangle(a, b, c);
        System.out.printf(
                """
                        Triangle with sides: a = %.2f, b = %.2f, %.2f
                        Perimeter: %.2f
                        Area: %.2f
                        """,
                a, b, c, triangle.getPerimeter(), triangle.getArea()
        );
    }

    static void printRectangle() {
        double a = 2;
        double b = 3;

        Figure rectangle = new Rectangle(a, b);
        System.out.printf(
                """
                        Rectangle with sides: a = %.2f, b = %.2f
                        Perimeter: %.2f
                        Area: %.2f
                        """,
                a, b, rectangle.getPerimeter(), rectangle.getArea()
        );
    }

    static void printCircle() {
        double radius = 4;

        Figure circle = new Circle(radius);
        System.out.printf(
                """
                        Circle with radius = %.2f
                        Perimeter: %.2f
                        Area: %.2f
                        """,
                radius, circle.getPerimeter(), circle.getArea()
        );
    }

    static void exceptionCheck() {
        try {
            new Triangle(0, -1, 2);
        } catch (NotValidFigureParametersException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            new Rectangle(-1, 0);
        } catch (NotValidFigureParametersException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            new Circle(-1);
        } catch (NotValidFigureParametersException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void checkIsSquare() {
        double a = 1;
        double b = 1;

        Rectangle rectangle = new Rectangle(a, b);

        System.out.printf(
                """
                        Rectangle with sides: a = %.2f, b = %.2f
                        Is square: %b
                        """,
                a, b, rectangle.isSquare()
        );
        System.out.println();

        b = 5;
        rectangle.setB(b);
        System.out.printf(
                """
                        Rectangle with sides: a = %.2f, b = %.2f
                        Is square: %b
                        """,
                a, b, rectangle.isSquare()
        );
    }
}