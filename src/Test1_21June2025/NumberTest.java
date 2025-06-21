package Test1_21June2025;

import java.util.Scanner;

public class NumberTest {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        if(a<0)
            System.out.println("Negative number");
        else if(a==0)
            System.out.println("Zero");
        else System.out.println("Positive number");
    }
}
