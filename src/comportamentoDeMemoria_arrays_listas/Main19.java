package comportamentoDeMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

public class Main19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Main20[] vect = new Main20[n];
		
		for (int i = 0; i < vect.length; i++) { // vect.length é mais coeso do que depender de uma variável
			sc.nextLine(); // para corrigir o enter do número inicial
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Main20(name, price);
		}
		sc.close();
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) 
			sum += vect[i].getPrice() / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f\n", sum);
	}

}
