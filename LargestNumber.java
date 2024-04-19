import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();

        // Q:- Find the largest among the three number

        int max = a;
        if (b>max){
            max = b;
        }
        if (c>max){
            max=c;
        }
        System.out.println("Largest number is" +max);


    }
}
