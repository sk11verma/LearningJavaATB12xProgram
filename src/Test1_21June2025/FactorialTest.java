package Test1_21June2025;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        long num1=1;
        if(num==0)
            System.out.println("Factorial of 0 is always 1");
        else{
        for(int i=num;i>0;i--){
            num1=num1*i;

        }
        System.out.println("factorial of " +num+ "=" +num1);
    }
}}
