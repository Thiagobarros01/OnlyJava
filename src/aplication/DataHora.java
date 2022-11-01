package aplication;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class DataHora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter dt3 = DateTimeFormatter.ISO_INSTANT;
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-10-03");
		LocalDateTime d05 = LocalDateTime.parse("2022-10-03T15:36:50");
		Instant d06 = Instant.parse("2022-10-03T15:36:50Z");
		LocalDate d07 = LocalDate.parse("03/10/2022",dt);
		LocalDateTime d08 = LocalDateTime.of(2022, 3, 03, 15, 56);
		DateTimeFormatter dt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//LocalDateTime dt001 = LocalDateTime.parse("07-10-2022T12:47:30");
		
		LocalDate d09 = LocalDate.parse("03/10/2022",dt);
		
		
		Instant d10 = Instant.parse("2022-10-03T16:12:30Z");
		
		
		Instant d11 = Instant.parse("2022-10-05T10:42:30Z");
		LocalDate r4 = LocalDate.ofInstant(d11, ZoneId.systemDefault());
		LocalDate r5 = LocalDate.ofInstant(d11, ZoneId.of("Portugal"));
		Duration t = Duration.between(d10, d11);
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09.format(dt));
		System.out.println(dt2.format(d10));
		System.out.println(dt3.format(d10));
		System.out.println(d10.toString());
		System.out.println(d11);
		System.out.println(r4.getDayOfMonth()); // usando .get para pegar mes, ou ano, ou dia
		System.out.println(r5);
		System.out.println(r5.plusDays(5));
		System.out.println(d11.plus(5, ChronoUnit.DAYS));
		System.out.println(t.toDays());
		//System.out.println(dt001.format(dt5));
		
		System.out.println();
		System.out.println();
		LocalDate d007 = LocalDate.parse("03/10/2022",dt);
		
		DateTimeFormatter datas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter datasT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		LocalDate d1 = LocalDate.parse("2022-10-07");
		
		LocalDateTime d2 = LocalDateTime.parse("2022-10-07T13:01:00") ;
		System.out.println(d1.format(datas));
		System.out.println(d2.format(datasT));
		System.out.println(dt);
		System.out.println(d1.format(dt));
		LocalDate d001 = LocalDate.parse("2022-10-03");
		System.out.println(d001.getMonthValue());
		System.out.println("Data: ");
		//LocalDate dataa = LocalDate.parse(sc.next(), dt);
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		System.out.println();
		System.out.println(d01);
		LocalDate r14 = LocalDate.ofInstant(d11, ZoneId.systemDefault());
		LocalDate s = LocalDate.now();
		System.out.println(s.getYear());
		System.out.println(s.getMonthValue());
		
		
	}

}
