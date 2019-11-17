package comportamentoDeMemoria_arrays_listas;

// Seção 10.91 Udemy. Laço for each
public class Main21 {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++)
			System.out.println(vect[i]);
	
	System.out.println("----------------------");
// Usando o laço for each
	//Leitura: Leitura: "para cada objeto 'obj' contido em vect, faça:"
		for (String obj : vect) // obj poderia ser qualquer nome inventado
			System.out.println(obj);
	}
}
