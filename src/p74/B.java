package p74;

public abstract class B {

	public void x() {}
	public abstract void z();
	
}




/*
Which code, when inserted at one or more marked positions, would allow classes B and C to compile?
將以下哪個代碼插入到一個或多個標記位置，可以使類B和C編譯？

A. implement A     // position 1
   @Override       // position 2
   實現 A          // 位置 1
   @Override       // 位置 2

B. @Override       // position 2
   public void z() // position 3
   @Override       // 位置 2
   public void z() // 位置 3

C. @Override       // position 3
   void x() {}     // position 3
   @Override       // position 3
   public void z() {} // position 3
   @Override       // 位置 3
   void x() {}     // 位置 3
   @Override       // 位置 3
   public void z() {} // 位置 3

D. public void z() {} // position 3
   public void z() {} // 位置 3
*/
