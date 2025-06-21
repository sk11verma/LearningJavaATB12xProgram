package Test1_21June2025;

public class TypeCasting {
    public static void main(String[] args) {
        int i=10;
        double b=i;//Implicit type casting/auto typecasting
        int c= (int) b;
        System.out.println(i+","+b+","+c);
        System.out.println(i*c+b-i*(i+c));


    }
}
