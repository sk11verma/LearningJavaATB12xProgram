package Test1_21June2025;

import java.util.Scanner;

public class EqualityTest {
    public static void main(String[] args) {
            System.out.println("Enter first number");
            Scanner sc = new Scanner(System.in);
            int a=sc.nextInt();
        System.out.println("Enter Second number");
        Scanner sc1 = new Scanner(System.in);
        int b=sc1.nextInt();System.out.println("Enter Third number");
        Scanner sc2 = new Scanner(System.in);
        int c=sc2.nextInt();
        if(a==b&&b==c)
            System.out.println("All Three entered numbers are equal");
        else if((a==b&&b!=c)||(b==c&&a!=c))
            System.out.println("Atleast two numbers are equal");
           else
               System.out.println("No numbers are equal");

        }
    }

