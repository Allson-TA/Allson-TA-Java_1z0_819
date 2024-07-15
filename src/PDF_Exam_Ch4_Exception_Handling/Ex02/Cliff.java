package PDF_Exam_Ch4_Exception_Handling.Ex02;

public class Cliff {
	
	public final void climb() throws Exception{
		
		try(HikingGer gear = new HikingGer()){
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		
		try {
			new Cliff().climb();
		} catch (Throwable t) {
			System.out.println(t);
		}
		
	}
	
}

/* 
Given the following application, what is the name of the class printed at line e1?
假設以下的應用程式，e1 行中打印的類的名稱是什麼？

A. canyon.fallenException
B. java.lang.RuntimeException
C. The code does not compile.
D. The code compile, but the answer cannot be determined until runtime.
   代碼編譯成功，但答案要等到運行時才能確定。
  
E. None of the above
*/