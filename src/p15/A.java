package p15;

public class A {
	
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return getName();
	}
	
}

public class B extends A {
	
	public void setName(String name) {
		super.setName("\""+ name + "\"");
	}
	public void setName(String ...nameParts) {
		var output = format(nameParts);
		setName(output);
	}
	private String format(String...parts) {
		var sb = new StringBuilder();
		for(String part:parts) {
			sb.append(part).append(' ');
		}
		return sb.toString();
	}
	public static void main(String...args) {
		A a = new B();
		a.setName(args);	//	因為A.setName方法只有String name單一值，而不是陣列 如果String args就可以
	}
}

/*
Why does this compilation fail?
為什麼這個編譯會失敗？

A. The field A.name is not accessible from class B.
   A.name 欄位在類別 B 中不可訪問。

B. There is no method a.setName(String... parts)
   沒有方法 a.setName(String... parts)。

C. There is no B.toString() method to override A.toString()
   沒有 B.toString() 方法來覆蓋 A.toString()。

D. The method B.format is private
   方法 B.format 是私有的。

E. The B instance cannot be assigned to an A class reference
   B 實例不能賦值給 A 類的引用。
*/
