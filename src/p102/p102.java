package p102;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class p102 {

	public static void main(String[] args) {
		
		/*
		根據美國的日期格式:
			中等(MEDIUM)格式 : Dec 17,2018
			短(SHORT)格式 : 12/17/18
		*/
		
		Locale l = new Locale("en","US");
		LocalDate today = LocalDate.of(2018, 12, 17);
		
		//	因為出題者所在地是美國，所以後面不加上withLocale(l)的話，會依照當地的格式調整，變成 : 2018年12月17日 & 2018/12/17
		String mToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		String sToday = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		
		System.out.println(mToday);
		System.out.println(sToday);
		
		//	理應當變成這樣
		/*
		String mToday2 = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(l));
		String sToday2 = today.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(l));
		System.out.println(mToday2);
		System.out.println(sToday2);
		*/
	}

}
/*
What is the result?
結果是什麼？

A. Dec 17, 2018
   12/17/18

B. 12/17/18
   Dec 17, 2018

C. Friday, December 17, 2018
   December 17, 2018

D. December 17, 2018
   12/17/18
*/
