import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_array_form_of_integer {
    static List<Integer> addToArrayForm(int[] nums,int k){
        List<Integer> temp=new ArrayList<>();
        String num="";
        for(int x:nums)
            num+=Integer.toString(x);
        int org=Integer.parseInt(num)+k;
        System.out.println(org);
        while(org>0){
            int rem=org%10;
            temp.add(rem);
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
