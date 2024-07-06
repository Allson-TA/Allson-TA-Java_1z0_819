package p82;

import java.nio.file.Path;
import java.util.Collection;

public class p82 {
	
	public interface A {
	    public Iterable a();
	}

	public interface B extends A {
	    public Collection a();
	}

	public interface C extends A {
	    public Path a();
	}

	public interface D extends B,C {
	}
/*
	--Iterable弒父類，path collection是子類--


	Why does D cause a compilation error?
	為什麼D會導致編譯錯誤？

	A. D extends more than one interface.
	   D擴展了多個接口。
	B. D does not define any method.
	   D沒有定義任何方法。
	C. D inherits a() from B and C but the return types are incompatible.
	   D從B和C繼承了a()但返回類型不兼容。
	D. D inherits a() only from C.
	   D只從C繼承a()。
	*/

}
