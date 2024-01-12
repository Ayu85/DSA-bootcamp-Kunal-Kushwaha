import java.util.ArrayList;
import java.util.List;

public class kids_with_greatest_number_candies {
    static ArrayList<Boolean> get(int[] kids, int extraCandies){
        ArrayList<Boolean> ans =new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int x:kids){
           if(x>max)
               max=x;
        }
        for(int x:kids){
            if(x+extraCandies>=max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
    public static void main(String[] args) {
    int[] kids={4,2,1,1,2};
    ArrayList<Boolean> l1=get(kids,1);
    for(Boolean x:l1)
        System.out.print(x+" , ");
    }
}
