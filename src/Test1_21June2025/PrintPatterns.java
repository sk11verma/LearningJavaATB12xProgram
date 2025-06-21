package Test1_21June2025;

import java.util.Scanner;

public class PrintPatterns {
    public static void main(String[] args) {
        System.out.println("Enter no of lines");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Printing Triangle");
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++) {
                System.out.print("*  ");
            }
        System.out.println();
        }

    }}



