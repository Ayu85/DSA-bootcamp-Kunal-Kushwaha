import java.util.Arrays;

public class plus_one {
    static int[] plusOne(int[] digits) {
        long num = 0;
        int p = digits.length - 1;
        for (int x : digits) {
            num += x * (long) Math.pow(10, p--);
        }
        System.out.println(num);
        long plusOneNum = num + 1;
        long plus2 = num + 1;
        int c = 0;
        while (plusOneNum > 0) {
            long rem = plusOneNum % 10;
            c++;
            plusOneNum /= 10;
        }
        int[] temp = new int[c];
        long k = c - 1;
        while (plus2 > 0) {
            long rem = plus2 % 10;
            temp[(int) k--] = (int) rem;
            plus2 /= 10;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] digits={7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
