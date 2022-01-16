package com.company;
import java.util.ArrayList;

public class Checker {
    private ArrayList<Point> points;
    private int[][] array;
    private Point start;

    public Checker(int[][] array, Point start) {
        this.points = new ArrayList<>();
        this.array = array;
        this.start = start;

    }

    public Point checkPoint (int addx, int addy) {
        int x = start.x + addx;
        int y = start.y + addy;
        if (y>=0 && y<array.length) {
            if (x>=0 && x<array[y].length) {
                Point result = new Point (x,y);
                return result;
            }
        }
        return null;
    }

    public ArrayList<Point> checkRight() {
        ArrayList<Point> result = new ArrayList<>();
        Point up = checkPoint(2,1);
        Point down = checkPoint(2,-1);
        if (up!=null)  {result.add(up);};
        if (down!=null) {result.add(down);};
        return result;
    }

    public ArrayList<Point> checkLeft() {
        ArrayList<Point> result = new ArrayList<>();
        Point up = checkPoint(-2,1);
        Point down = checkPoint(-2,-1);
        if (up!=null)  {result.add(up);};
        if (down!=null) {result.add(down);};
        return result;
    }

    public ArrayList<Point> checkUp() {
        ArrayList<Point> result = new ArrayList<>();
        Point right = checkPoint(1,2);
        Point left = checkPoint(-1,2);
        if (right!=null)  {result.add(right);};
        if (left!=null) {result.add(left);};
        return result;
    }

    public ArrayList<Point> checkDown() {
        ArrayList<Point> result = new ArrayList<>();
        Point right = checkPoint(1,-2);
        Point left = checkPoint(-1,-2);
        if (right!=null)  {result.add(right);};
        if (left!=null) {result.add(left);};
        return result;
    }


    public ArrayList<Point> check() {
        ArrayList<Point> result = new ArrayList<>();
        if (!(this.checkRight().isEmpty())) {
            result.addAll(this.checkRight());
        }
        if (!(this.checkLeft().isEmpty())) {
            result.addAll(this.checkLeft());
        }
        if (!(this.checkUp().isEmpty())) {
            result.addAll(this.checkUp());
        }
        if (!(this.checkDown().isEmpty())) {
            result.addAll(this.checkDown());
        }
        return result;
    }
}
