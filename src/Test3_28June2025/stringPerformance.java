package Test3_28June2025;

public class stringPerformance {
    public static void main(String[] args) {
        String s1=new String("Suresh");
        s1+="Verma";
        System.out.println(s1);
        System.out.println(s1.concat("Verma"));
        System.out.println(s1);
    }
}
