import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        char ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z')
            System.out.println("Lower case");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println("Upper case");

        else
            System.out.println("**********Wrong input************");

    }

}
