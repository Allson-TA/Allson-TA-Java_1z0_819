package p22;

public class Main {

	public static void main(String[] args) {
		
		String[] furnitures = {"Door","Windows","Chair"};
		var sb = new StringBuilder();
		for(var i=0;i<furnitures.length;i++) {
			var index = i + 1;
			sb.append(i).append(").").append(furnitures[i].charAt(i)).append(",");
			if(index < furnitures.length) {
				sb.append(" | ");
			}
		}
		sb.delete(sb.length()-2, sb.length()-1);
		sb.insert(0, '[').insert(sb.length()-1, ']');
		System.out.println(sb);
		

	}

}

/*
What is the result?
結果是什麼？

A. ArrayIndexOutOfBoundsException is thrown at runtime.
   執行時拋出 ArrayIndexOutOfBoundsException。

B. The compilation fails.
   編譯失敗。

C. []. o, | 1). a, | 2).]

D. [0). o, | 1). i, | 2). r]

E. [0). D, | 1). i, | 2). a]
*/
