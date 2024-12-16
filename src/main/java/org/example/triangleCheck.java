package org.example;

public class triangleCheck {

    public static String checkTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Invalid input - sides must not be negative.";
        }

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                return "Equilateral triangle.";
            } else if (a == b || b == c || a == c) {
                return "Isosceles triangle.";
            } else {
                return "Scalene triangle.";
            }
        } else {
            return "This is not a triangle.";
        }
    }
}
