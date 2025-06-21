package Test1_21June2025;

import java.util.Scanner;

public class PrintingPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter range");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 1 || num == 2)
            System.out.println("1 and two are not prime");
        else {
            System.out.println("Prime Numbers are");
            for (int i = 3; i < num; i++) {
                int k = 0;
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0)
                        k++;
                }
                if (k <= 1)
                    System.out.println(i);

            }
        }

    }
}
