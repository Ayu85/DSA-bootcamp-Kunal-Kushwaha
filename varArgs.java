public class varArgs {
    static float getSum(float ...a){
    float sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(getSum(2,4,5.5f));
    }
}
