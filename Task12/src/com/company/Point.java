package com.company;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        String x = Character.toString((char)this.x+65);
        return (x+this.y);
    }
}
