public class search_in_Strings {
    static int getIndex(String [] arr,String target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr={"aayush","sharad","jhanvi","shipra"};
        System.out.println(getIndex(arr,"anj"));
    }
}
