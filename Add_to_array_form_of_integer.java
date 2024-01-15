import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_array_form_of_integer {
    static List<Integer> addToArrayForm(int[] num,int k){
        List<Integer> temp=new ArrayList<>();
        long result=0;
        int p=num.length-1 ;
        for(int x:num)
        {
            result+= (long) (x*Math.pow(10,p));
          //  System.out.print(result+" ");
            p--;
        }
        long org=result+k;
       // System.out.println(org);
        while(org>0){
            long rem=org%10;
            temp.add((int) rem);
            org/=10;
        }
        Collections.reverse(temp);
        return temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,0};
        List<Integer> res=addToArrayForm(arr,34);
        for(int x:res)
            System.out.print(x+" ");
    }
}
