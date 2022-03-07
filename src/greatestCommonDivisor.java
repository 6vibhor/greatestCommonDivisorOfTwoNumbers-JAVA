import java.util.Scanner;

public class greatestCommonDivisor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int num1 = scan.nextInt();
        System.out.println("Enter another number");
        int num2 = scan.nextInt();
        System.out.println("The greatest common divisor: " + gcd(num1, num2));
    }

    public static int gcd(int num1, int num2) {
        int gcd = 0;
        if(num1 < 1 || num2 < 1) {
            return -1;
        }
        int num3 = Math.min(num1, num2);
        for(int i = 1; i <= num3; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
