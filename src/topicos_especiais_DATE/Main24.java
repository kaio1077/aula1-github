package topicos_especiais_DATE;
// DATE
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main24 {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); // data atual
		Date x2 = new Date(System.currentTimeMillis()); // Instante do meu sistema, converte para milissegundos e informa a hora atual
		Date x3 = new Date(0L); // Valor do milissegundo 0.
		Date x4 = new Date(1000L * 60L * 60L * 5L); //converter para 5 horas depois, sufixo L para indicar long,
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07"); // parse serve para usar os parâmetros do simpleformat
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // Padrão UTC. Padrão ISO 8601 e classe INSTANT
		
		System.out.println("------------------------");
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("------------------------");
		System.out.println("x1: " + sdf1.format(x1));
		System.out.println("x2: " + sdf1.format(x2));
		System.out.println("x3: " + sdf1.format(x3));
		System.out.println("x4: " + sdf1.format(x4));
		System.out.println("y1: " + sdf1.format(y1));
		System.out.println("y2: " + sdf1.format(y2));
		System.out.println("y3: " + sdf1.format(y3));
		System.out.println("------------------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("------------------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));
	}

}
