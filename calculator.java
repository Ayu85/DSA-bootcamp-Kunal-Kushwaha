import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Operation (+,-,/,*): ");
        char ch=sc.next().charAt(0);
        System.out.println("Enter Two Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (ch){
            case '+'-> System.out.println(a+b);
            case '-'-> System.out.println(a-b);
            case '/'-> System.out.println(a/b);
            case '*'-> System.out.println(a*b);
            default-> System.out.println("Wrong input ");
        }
    }
}
