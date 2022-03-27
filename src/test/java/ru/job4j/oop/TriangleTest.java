package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void when40and40and40ThenMinus1() {
        Point a = new Point(4, 0);
        Point b = new Point(4, 0);
        Point c = new Point(4, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(-1, 0));
    }

    @Test
    public void when400and040and004Then8() {
        Point a = new Point(4, 0, 0);
        Point b = new Point(0, 4, 0);
        Point c = new Point(0, 0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.01));
    }

    @Test
    public void when400and400and400ThenMinus1() {
        Point a = new Point(4, 0, 0);
        Point b = new Point(4, 0, 0);
        Point c = new Point(4, 0, 0);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(-1, 0));
    }
}