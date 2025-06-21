package Test1_21June2025;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<=num;i++)
        {
            if (num%i==0)
            count++;
    }
    if (count>1)
        System.out.println("Number is not prime");
    else System.out.println("Number is prime");


        }
    }


