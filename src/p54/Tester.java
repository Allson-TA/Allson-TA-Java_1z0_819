package p54;

class NoMatchException extends RuntimeException{}

public class Tester {

	public static void main(String[] args) {
		
		try {
			if("oracle".equals("ORACLE".toLowerCase())) {
				throw new NoMatchException();
			}
		} catch (NoMatchException | NullPointerException npe) {
			System.out.println("Exception1");
		} catch (RuntimeException e) {
			System.out.println("Exception2");
		} catch (Exception e) {
			System.out.println("Exception3");
		}  finally {
			System.out.println("Finally Block");
		}
		

	}

}

/*
How many lines of text does this program print?
這個程式會列印出多少行文字？

A. three
   三行

B. four
   四行

C. two
   兩行

D. one
   一行
*/

