import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabets");
        char ch = sc.next().charAt(0);
        if (ch>'a' && ch<'z')
        {
            System.out.println("Lower case");
        }else if ( ch>'A' && ch<'Z') {
            System.out.println("Upper case");
        }
        else{
            System.out.println("Enter valid input");
        }

    }
}
