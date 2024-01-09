public class numberOfOccurrances {
    static int getOccr(int n, int target) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == target)
                count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getOccr(64544, 1));
    }
}
