import java.util.Scanner;

public class Addition {
    public static void main( String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;
        int n2;
        int sum;

        System.out.print("Enter first integer: ");
        n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        n2 = input.nextInt();

        sum = n1 + n2;

        System.out.printf("Sum is %d\n", sum);
    }
    
}
