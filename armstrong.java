public class armstrong {
    static boolean isArms(int n){
       int org=n;
        int result=0;
        while(n>0){
            int rem=n%10;
            result+=rem*rem*rem;
            n/=10;
        }
        if(result==org)
            return true;
        else
            return false;


    }
    public static void main(String[] args) {
        System.out.println(isArms(153));
    }
}
