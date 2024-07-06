package p83;

public class MyPersistenceData {//	直接implements java.io.serializable
	
	String str;
	private void methodA() {
		System.out.println("methodA");
	}
	
	/*
	You want to implements the java.io.Serializable interface to the MyPersistenceData class.
	你想要在 MyPersistenceData 類中實現 java.io.Serializable 接口。

	Which method should be override?
	應該覆蓋哪個方法？

	A. the writeExternal method.
	   writeExternal 方法。
	B. the readExternal and writeExternal method.
	   readExternal 和 writeExternal 方法。
	C. the readExternal methos.
	   readExternal 方法。
	D. nothing.
	   沒有。
	*/

}
