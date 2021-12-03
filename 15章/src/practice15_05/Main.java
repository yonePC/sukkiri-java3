package practice15_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
//		LocalDate future = now.plus(Period.ofDays(100));		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println((fmt));
	}

}
