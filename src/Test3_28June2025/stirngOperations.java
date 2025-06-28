package Test3_28June2025;

public class stirngOperations {
    public static void main(String[] args) {
        String s1=new String("Suresh");
        String s2=new String("suresh");
        System.out.println(s1==s2);
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
    }
}
