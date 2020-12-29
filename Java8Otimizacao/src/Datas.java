import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje  = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println("--------------------");
		
		LocalDate olimpiadasToquio = LocalDate.of(2021,  Month.JUNE, 5);
		
		int anos = olimpiadasToquio.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		System.out.println("--------------------");
		
		Period periodo = Period.between(hoje, olimpiadasToquio);
		System.out.println(periodo.getMonths());
		
		System.out.println("--------------------");
		
		LocalDate proximasOlimpiadas = olimpiadasToquio.plusYears(4);		
		System.out.println(proximasOlimpiadas);
		
		System.out.println("--------------------");
		
		DateTimeFormatter formator = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String valorFormatado = proximasOlimpiadas.format(formator);
		System.out.println(valorFormatado);
		
		System.out.println("--------------------");
		
		DateTimeFormatter formatorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		LocalDateTime agora  = LocalDateTime.now();
		System.out.println(agora.format(formatorComHoras));
		
		

	}

}
