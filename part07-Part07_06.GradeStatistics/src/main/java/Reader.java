
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
public class Reader {
    private Scanner scanner;
    private Statistic stats;


    public Reader() {
        this.scanner = new Scanner(System.in);
        this.stats = new Statistic();
    }

    public void start() {

        System.out.println("Enter point totals, -1 stops:");
        int num;
        while(true) {
            num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                break;
            }

            if (num >= 0 && num <= 100) {
                stats.add(num);
            }
        }

        System.out.println("Point average (all): " + stats.average());
        if (stats.averagePassingGrade() != -1) {
            System.out.println("Point average (passing): " + stats.averagePassingGrade());
        } else {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: " + stats.passPercentage());
        stats.printGradeDistribution();
    }
}
