package p06;

import java.sql.Timestamp;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("aa");
		Timestamp ts = new Timestamp(1);
	}
}

/*
1. 開啟CMD
2. cd C:\Users\Allson.Chen\Java SE 11 - 1z0-819\Java_1z0_819\src\p06
3. javac -encoding UTF-8 Test.java
4. dir
出現class檔案 ( 如果沒出現記得要再一次編譯UTF-8 --> javac -encoding UTF-8 Test.java )
5. jdeps -summary Test.class

顯示以下資訊(答案)
Test.class -> java.base
Test.class -> java.sql

What is the result on execution of these commands?
執行這些命令的結果是什麼？

A. Test.class -> java.sql -> java.class
B. Test.class -> java.base
   Test.class -> java.sql
   java.sql -> java.base
C. Test.class -> java.base
   Test.class -> java.sql
D. On execution, the jdeps command displays an error
   執行時，jdeps 命令顯示錯誤
*/
