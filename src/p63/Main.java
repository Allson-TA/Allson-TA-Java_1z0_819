package p63;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args)throws IOException {
		
		List item1 = new ArrayList<>();
		item1.add(new Item(1, "Pen"));
		item1.add(new Item(2, "Ruler"));
		Box b1 = new Box(123, "s", item1);
		try (FileOutputStream fout = new FileOutputStream("boxser.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);){
			out.writeObject(b1);
			out.flush();
			out.close();
		}catch (Exception e) {
			System.out.println("Unable to Serialize");
		}
		} 
	}
/*
Which action serialized the b1 object?
哪個動作序列化了 b1 對象？

A. Override readObject() and writeObject() methods in the Book class.
   重寫 Book 類中的 readObject() 和 writeObject() 方法。

B. Handle NotSerializableException in the try clause or throw in the main() method definition.
   在 try 語句中處理 NotSerializableException 或在 main() 方法定義中拋出。

C. Implement the Serializable interface in the Item class.		因為BOX有序列話，但是Item沒有，導致Item的id name都沒辦法序列話，所以要實做才可以讓b1序列化
   在 Item 類中實現 Serializable 接口。

D. Add SerialVersionUID to the Box and Item class.
   向 Box 和 Item 類添加 SerialVersionUID。

E. Remove out.flush() method invocation.
   刪除 out.flush() 方法調用。
*/

