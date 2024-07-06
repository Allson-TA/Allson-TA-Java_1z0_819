package p87;

public class p87 {

	@interface Resource {
	    String[] value();
	}

	//	loc1
	public class ProcessOrders { ... }

}
/*
Which two annotations may be applied at loc1 in the code fragment?
在代碼片段中的loc1處可以應用哪兩個註釋？

A. @Resource(value={{}})
B. @Resource("Customer1")
C. @Resource({"Customer1", "Customer2"})
D. @Resource
E. @Resource()
*/
