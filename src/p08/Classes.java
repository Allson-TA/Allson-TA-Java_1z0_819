package p08;

import java.io.Serializable;

public class Classes implements Serializable{
	String id;
}

//	Person 沒有 implements Serializable，等於不可序列化
class Person {
	String name;
	transient String address;	// 即便 Person 有Serializable，transient就是代表不可被序列化
}

class Student extends Person implements Serializable {
	String studentNo;
	Classes classes = new Classes();
}


/*
Which fields are serialized in a Student object?
在 Student 對象中，哪些字段是可序列化的？

A. studentNo and name
   學號和姓名

B. studentNo and classes
   學號和課程

C. studentNo, classes, name and address	
   學號、課程、姓名和地址

D. studentNo, classes and name
   學號、課程和姓名
*/
