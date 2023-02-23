import java.util.Scanner;

public class SumaLenta {
	public static void main(String [] args) {
		int a,b;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Enter two numbers separated by a space");
		a = entrada.nextInt();
		b = entrada.nextInt();
		while (a != 0) {
			a = a-1;
			b = b +1;
		}
		System.out.printf("The result is %d \n", b);
		//System.out.println(b);
	}
}
