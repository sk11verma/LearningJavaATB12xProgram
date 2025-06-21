package Test1_21June2025;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter First Number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter Second Number");
        Scanner sc1=new Scanner(System.in);
        int num2=sc1.nextInt();
        System.out.println("Enter Operator");
        Scanner sc2=new Scanner(System.in);
        String op=sc2.next();
        switch(op)
        {
           case "Add":
               System.out.println(num1+num2);break;
            case "Sub":
                System.out.println(num1-num2);break;
            case "Div":
                if(num2==0)System.out.println("Divide by 0 is not possible with this operation");
                else System.out.println(num1/num2);break;
            case "Mul":
                System.out.println(num1*num2);break;
            default:
                System.out.println("Operator not matching");

        }

    }
}
