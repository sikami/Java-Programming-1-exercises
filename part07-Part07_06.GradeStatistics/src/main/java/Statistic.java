
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Statistic {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingGrade;
    private final int PASS;

    public Statistic() {
        this.points = new ArrayList<>();
        this.passingGrade = new ArrayList<>();
        this.PASS = 100;
    }

    public void add(int number) {
        this.points.add(number);
        if (number >= 50) {
            this.passingGrade.add(number);
        }
    }

    public void printPoints() {
        for (int num : points) {
            System.out.println(num);
        }
    }

    public double average() {
        int sum = 0;
        double average;
        for (int num : points) {
            if (num >= 0) {
                sum += num;
            }
        }
        average = (double) sum / (double) points.size();
        return average;
    }

    public double averagePassingGrade() {
        if (passingGrade.isEmpty()) {
            return -1;
        }
        int sum = 0;
        double average;
        for (int num : passingGrade) {
            sum += num;


        }
        average = (double) sum / (double) passingGrade.size();
        return average;
    }

    public double passPercentage() {
        double percentage;
        percentage = (PASS * (double) passingGrade.size()) / (double) points.size();
        return percentage;
    }
    
    public void printGradeDistribution() {
        int failed = 0, one = 0, two = 0, three = 0, four = 0, five = 0;

        for (int num : points) {
            if (num < 50) {
                failed++;
            } else if (num < 60) {
                one++;
            } else if (num < 70) {
                two++;
            } else if (num < 80) {
                three++;
            } else if (num < 90) {
                four++;
            } else if (num >= 90) {
                five++;
            }
        }

        System.out.println("Grade distribution:");
        System.out.print("5: ");
        printStars(five);
        System.out.print("4: ");
        printStars(four);
        System.out.print("3: ");
        printStars(three);
        System.out.print("2: ");
        printStars(two);
        System.out.print("1: ");
        printStars(one);
        System.out.print("0: ");
        printStars(failed);

    }

    public void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
}
