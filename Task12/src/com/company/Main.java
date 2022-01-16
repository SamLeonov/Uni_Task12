package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Point> points = new ArrayList<>();
        
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
