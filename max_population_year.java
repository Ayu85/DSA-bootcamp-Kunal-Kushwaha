public class max_population_year {
    static void getYear(int[][] logs){
        int [] arr=new int[101];
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0];j<logs[i][1];j++)
                arr[j-1950]++;
        }
       int max=0;
        int year=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
                year =1950+i;
            }
        }
        System.out.println(year);
    }
    public static void main(String[] args) {
        int[][] arr={{1950,1961},{1960,1971},{1970,1981}};
       int [][] arr2={{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};
        getYear(arr2);
    }
}
