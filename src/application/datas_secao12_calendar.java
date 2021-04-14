package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class datas_secao12_calendar {

	public static void main(String[] args) throws ParseException {

		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //padrao ISO 8601 - Formato UTC

		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		// adicionando horas
//		cal.setTime(d);
//		cal.add(Calendar.HOUR_OF_DAY, 4);
//		d = cal.getTime();

//		System.out.println(sdf.format(d));
		
		cal.setTime(d);
		cal.setTime(d);
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); // o mes começa com 0
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);


	}

}
