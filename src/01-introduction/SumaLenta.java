import java.util.Scanner;

public class SumaLenta {
	public static void main(String [] args) {
		int a,b;
		Scanner entrada = new Scanner (System.in);
		a = entrada.nextInt();
		b = entrada.nextInt();
		while (a != 0) {
			a = a-1;
			b = b +1;
		}
		System.out.println(b);
	}
}
