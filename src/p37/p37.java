package p37;

public class p37 {
	/*
	Which two var declarations compile?
	哪些 var 聲明可以編譯？

	A. class Book {	//	var不可以用在物件 、 類別 變數
	      var title = "A brief history of tomorrow";
	      類 Book 中的變量聲明 var title = "A brief history of tomorrow";
	   }
	   
	B. for (var x : System.getProperties().keySet()) {
	      System.out.println(x);
	   }
	   使用 var 在 for-each 循環中聲明變量 x。
	   
	C. var names = new ArrayList<String>();
	   names.add("Java");
	   names.add("Scale");
	   names.forEach((var name) -> System.out.println(name));
	   使用 var 宣告並初始化 names 為 ArrayList<String>，然後使用 var 在 forEach 中宣告 name。
	   
	D. var v = new Object() {
	      public var toString() {	//	不可用在方法回傳型別
	         return "func";
	      }
	   };
	   在匿名類中使用 var 宣告方法返回值類型。
	   
	E. class Car {	//	不得用於方法參考
	      private String model;
	      public void setModel(var model) {
	         this.model = model;
	      }
	   }
	   在方法參數中使用 var 宣告 model。
	*/

}
