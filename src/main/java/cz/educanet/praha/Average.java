package cz.educanet.praha;

import java.util.Scanner;

public class Average {

    public static double average(Scanner scanner) {

        while(scanner.hasNext()){
            System.out.println(scanner.nextInt());
        }


        return 1;
    }

    public static void main(String[] args) {
        System.out.println(average(new Scanner(System.in)));
    }
}
