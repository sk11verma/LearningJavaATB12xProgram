package Test1_21June2025;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc1=new Scanner(System.in);
        int num=sc1.nextInt();
        for(int i=1;i<=num;i++)
            System.out.print(i+" ");
    }
}
