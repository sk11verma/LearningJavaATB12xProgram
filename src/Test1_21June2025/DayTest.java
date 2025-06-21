package Test1_21June2025;

import java.text.BreakIterator;
import java.util.Scanner;

public class DayTest {
    public static void main(String[] args) {
        System.out.println("Enter day Number");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int i=day;
        switch(i) {
            case 1:
                System.out.println("It's Sunday");
                break;
            case 2:
                System.out.println("It's Monday");break;

            case 3:
                System.out.println("It's Tuesday");break;
            case 4:
                System.out.println("It's Wednesday");break;
            case 5:
                System.out.println("It's Thursday");break;
            case 6:
                System.out.println("It's Friday");break;
            case 7:
                System.out.println("It's Saturday");break;
            default:
                System.out.println("Incorrect value,Number should between 1 and 7");
        }
    }
}
