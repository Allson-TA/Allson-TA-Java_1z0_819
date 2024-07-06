package p59;

public class p59 {

	/*
	A company has an existing java app that includes two java 8 jar files sale-8.10.jar and clients-10.2.jar
	一家公司有一個現有的 Java 應用程序，其中包括兩個 Java 8 jar 文件：sale-8.10.jar 和 clients-10.2.jar

	The jar file, sales-8.10.jar, references packages in clients-10.2.jar,
	jar 文件 sales-8.10.jar 參考了 clients-10.2.jar 中的包，

	but clients-10.2.jar does not reference packages in sales-1.10.jar.
	但 clients-10.2.jar 並未參考 sales-1.10.jar 中的包。

	They have decided to modularize clients-10.2.jar.
	他們決定將 clients-10.2.jar 模塊化。
	*/

	
	/*
	語法:
	requires [module name]
	exports [package name];
	exports [package name] to [module name ...];
	uses [package name.class name]
	*/

	
	/*
	Which module-info.java file would work for the new library version client-10.3.jar?
	哪個 module-info.java 文件適用於新的庫版本 client-10.3.jar？

	A. module com.company.clients {		requires : 這模組不可使用自己，可以使用另一個模組
	   requires com.company.clients;
	   }
	   module com.company.clients {
	   需要 com.company.clients;
	   }

	B. module com.company.clients {		uses : 應該要指向一個街口，而不是資料夾/包
	   uses com.company.clients;
	   }
	   module com.company.clients {
	   使用 com.company.clients;
	   }

	C. module com.company.clients {		這表示模組可以將指定的包導出，以便其他模組可以共用包中的API
	   exports com.company.clients;
	   }
	   module com.company.clients {
	   輸出 com.company.clients;
	   }

	D. module com.company.clients {		//	不能只導出單個calss，要倒出整個資料夾/包
	   exports com.company.clients.Client;
	   }
	   module com.company.clients {
	   輸出 com.company.clients.Client;
	   }
	*/

	
}
