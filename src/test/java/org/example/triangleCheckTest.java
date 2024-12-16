package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TriangleCheckTest {

    @Test
    void testEquilateralTriangle() {
        assertEquals("Equilateral triangle.", triangleCheck.checkTriangle(2, 2, 2));
    }

    @Test
    void testIsoscelesTriangle() {
        assertEquals("Isosceles triangle.", triangleCheck.checkTriangle(7, 7, 11));
    }

    @Test
    void testScaleneTriangle() {
        assertEquals("Scalene triangle.", triangleCheck.checkTriangle(3, 4, 5));
    }

    @Test
    void testNotATriangle() {
        assertEquals("This is not a triangle.", triangleCheck.checkTriangle(3, 5, 8));
    }

    @Test
    void testNegativeSides() {
        assertEquals("Invalid input - sides must not be negative.", triangleCheck.checkTriangle(5, -2, 7));
    }

    @Test
    void testZeroSides() {
        assertEquals("Invalid input - sides must not be negative.", triangleCheck.checkTriangle(0, 0, 0));
    }

    @Test
    void testBorderValues() {
        assertEquals("Equilateral triangle.", triangleCheck.checkTriangle(1, 1, 1));
    }

    @Test
    void testLargeValues() {
        assertEquals("Equilateral triangle.", triangleCheck.checkTriangle(1000000, 1000000, 1000000));
    }

    @ParameterizedTest
    @CsvSource({
            "2, 2, 2, Equilateral triangle.",
            "7, 7, 11, Isosceles triangle.",
            "3, 4, 5, Scalene triangle.",
            "3, 5, 8, This is not a triangle.",
            "5, -2, 7, Invalid input - sides must not be negative.",
            "0, 0, 0, Invalid input - sides must not be negative.",
            "1, 1, 1, Equilateral triangle.",
            "1000000, 1000000, 1000000, Equilateral triangle."
    })
    void testCheckTriangle(int a, int b, int c, String expectedResult) {
        assertEquals(expectedResult, triangleCheck.checkTriangle(a, b, c));
    }
}
