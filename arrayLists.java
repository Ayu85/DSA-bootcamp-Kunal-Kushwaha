import java.util.ArrayList;

public class arrayLists {
    public static void main(String[] args) {
        ArrayList <Integer> l1=new ArrayList<>();
        for(int i=0;i<5000;i++){
            l1.add(i);
        }
        System.out.println(l1.toString());
    }
}
