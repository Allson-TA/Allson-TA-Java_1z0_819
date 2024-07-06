package p10.foo;

public class Foo {

	static final int A = 0;	//	沒有public權限
	
	public static final int B = 0;	//	public權限可以顯示即便是final
	
	private static final int C = 0;	//	private私人
	
	int d = 0;	//	沒有public權限
	
	protected int e = 0;	//	同個資料夾可存取 or 透過繼承方式也可以存取
	
	public int f = 0;	//	public權限可以顯示即便是final
	
	private int g = 0;	//	private私人
	
	//	被子類複寫，故不顯示
	public void foo(int h) {
		int i =0;
	}
	
}
