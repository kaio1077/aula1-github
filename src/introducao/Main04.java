package introducao;

/* Este é o programa que será um pouco mais elaborado com os novos aprendizados, melhorando agora as fórmulas da Area do triângulo. Evitando fórmulas repetidas


Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):
area = raiz (p( p - a)( p - b)( p - c) / 2)
p = (a + b + c) / 2
 */

import java.util.Locale;
import java.util.Scanner;



public class Main04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Main03 x, y; // Isto significa que temos uma variável do tipo Main03 que poderia ser chamado de Triangule para ajudar. Recebe as variáveis de outra classe
		x = new Main03(); // desta maneira utilizamos apenas duas variáveis x e y, ao invés de 6 (xA, xB, xC, yA, yB, yC) muito mais efetivo para a memória
		y = new Main03();
		
		System.out.println("Entre three measures of triangule X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre three measures of triangule Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		sc.close();
		
		double areaX = x.area(); // Chamada do meu método da classe Main03.java para calcular a área
		System.out.printf("Triangule X area: %.4f\n", areaX);
		
		double areaY = y.area(); // Chamada do meu método da classe Main03.java para calcular a área
		System.out.printf("Triangule Y area: %.4f\n", areaY);
		
		if (areaX > areaY)
			System.out.println("Larger area: X");
		else
			System.out.println("Larger area: Y");

	}

}
