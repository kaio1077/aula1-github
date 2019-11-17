package topicos_especiais_DATE;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

// Manipular data com Calendar
public class Main25 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println (sdf.format(d)); // Imprime com 3 horas de antecedência por causa do horário do Brasil em relação ao GMT
		
		// Somando tempo
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); // Hora do calendário será acrescentado 4 horas
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		// Pegando unidade de tempo
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
		int month = 1 + cal.get(Calendar.MONTH); // Precisa adicionar 1 porque no sistema Janeiro inicia como 0
		System.out.println("Month: " + month);
	}

}
