package p105;

import java.util.Map;

public class Y extends X {

	public void set(Map<String, String> map) {
		super.set(map);
	}
	
}
/*
Which two lines can replace line 1 so that the Y class compiles?
哪兩行代碼可以替換第1行以使Y類編譯？

A. map.forEach((k, v) -> set(v));
B. set(map);
C. super.set(map.values());
D. super.set(List map);
E. set(map.values());
*/
