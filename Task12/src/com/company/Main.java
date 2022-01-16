package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Point> points = new ArrayList<>();
        int[][] array = ArrayUtils.readIntArray2FromFile("files/file.txt");
        System.out.println("enter x coordinate: ");
        int x = scan.nextInt();
        System.out.println("enter y coordinate: ");
        int y = scan.nextInt();
        Point start = new Point(x,y);
        points.add(start);
        System.out.println("enter number of turns: ");
        int n = scan.nextInt();
        allPoints(points,array,n);
        for (Point i: points) {
            System.out.println(i.toString());
        }
    }

    public static void allPoints (ArrayList<Point> points, int[][] array, int n) {
        int start = 0; // ячейка массива с которой проверяем чтобы избежать повторов
        while (n>0) { //выход из рекурсии
            start += points.size() - 1; //отбрасываем пройденные точки
         for (int i = start;i<=points.size()-1;i++) { //передаем массив
            Checker ch = new Checker(array, points.get(i));
            for (Point k : ch.check()) {
                if (!(points.contains(k))) {
                    points.add(k); //все новые точки в массив
                }
            }
            n--;//обновляем счетчик

            allPoints(points,array,n); //рекурсия

         }
        }
    }
}
