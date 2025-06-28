package Test3_28June2025;

public class stringPerformance {
    public static void main(String[] args) {
        int N = 1_000_000;
        long start, elapsed;
        String s1=new String("Suresh");
        start = System.nanoTime();
        for (int i = 0; i < N; i++) s1.concat("x");
        elapsed = System.nanoTime() - start;
        System.out.printf("String: %.2f ms%n", elapsed / 1e6);
        StringBuilder sb = new StringBuilder("Hello");
        start = System.nanoTime();
        for (int i = 0; i < N; i++) sb.append("x");
        elapsed = System.nanoTime() - start;
        System.out.printf("StringBuilder: %.2f ms%n", elapsed / 1e6);


        // Using StringBuffer (thread-safe, but slower)
        StringBuffer sbf = new StringBuffer("Hello");
        start = System.nanoTime();
        for (int i = 0; i < N; i++) sbf.append("x");
        elapsed = System.nanoTime() - start;
        System.out.printf("StringBuffer: %.2f ms%n", elapsed / 1e6);

    }
}
