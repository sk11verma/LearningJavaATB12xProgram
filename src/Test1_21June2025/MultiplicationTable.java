package Test1_21June2025;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=10;j++) {
                System.out.print(i * j+"  ");
            }
            System.out.println();
    }}
}
