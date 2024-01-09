public class fibonacci {
    static void printFib(int n) {
        int a = 0;
        int b = 1;
        // System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            // System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println(b);
       
    }

    public static void main(String[] args) {
        printFib(6);
    }
}