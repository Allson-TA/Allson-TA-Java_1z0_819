package p41;

public class p41 {

	public static void main(String[] args) {
		for (var i = 0; i < 10; i++) {
			switch (i % 5) {
			case 2:
				i *= 2 * i;
				break;
			case 3:
				i++;
				break;
			case 1:
			case 4:
				i++;
				continue;
			default:
				break;
			}
			System.out.print(i + " ");
			i++;
		}
	}
}

/*
 * What is the result? 結果是什麼？
 * 
 * A. 0 0
 * 
 * B. 0 8 10 0 8 10
 * 
 * C. 0 4 9 0 4 9
 * 
 * D. 0 8 0 8
 * 
 * E. The code prints nothing. 程式不會印出任何東西
 */