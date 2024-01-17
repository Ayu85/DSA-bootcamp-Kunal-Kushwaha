import java.util.Arrays;

public class plus_one {
    static int[] plusOne(int[] digits){
        long num=0;
        int p=digits.length-1;
        for(int x:digits){
            num+=x*(long )Math.pow(10,p--);
        }
        System.out.println(num);
        long plusOneNum=num+1;
        long plus2=num+1;
        int c=0;
        while(plusOneNum>0){
            long rem=plusOneNum%10;
            c++;
            plusOneNum/=10;
        }
        int [] temp=new int[c];
        long k=c-1;
        while(plus2>0){
            long rem=plus2%10;
            temp[(int) k--]= (int) rem;
            plus2/=10;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] digits={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
