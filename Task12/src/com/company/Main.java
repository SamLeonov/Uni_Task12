package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] array = ArrayUtils.readIntArray2FromFile("files/file.txt");
        System.out.println("enter column: ");
        char c = scan.next().charAt(0);
        int x = (int)c - 65;
        System.out.println("enter row: ");
        int y = scan.nextInt();
        y=8-y;
        Point start = new Point(x,y);
        System.out.println("enter number of turns: ");
        int n = scan.nextInt();
        ArrayList<Point> points = allPoints(start,array,n);
        for (Point i: points) {
            System.out.println(i.toString());
        }
    }



    public static ArrayList<Point> allPoints(Point start,int[][] array, int n) {
        ArrayList<Point> points = new ArrayList<>();
        if (n>0) {
                Checker ch = new Checker(array, start);
                points.addAll(ch.check());
                for (Point i: ch.check()) {
                    points.addAll(allPoints(i,array,n-1));
                }
        }
        return points;
    }
}
