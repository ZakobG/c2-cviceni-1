package cz.educanet.praha;

import java.util.Scanner;

public class SumSumsOfEvenAndMultipleOfOdd {

    public static int sumSumsOfEvenAndMultipleOfOdd(Scanner scanner) {
        int sude = 0;
        int lichy = 1;

        while(scanner.hasNext()){
            int i = scanner.nextInt();

            if(i % 2 == 0){
                sude = sude + i;
            } else {
                lichy = lichy * i;
            }
        }

        return sude + lichy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println(sumSumsOfEvenAndMultipleOfOdd(sc));
    }
}