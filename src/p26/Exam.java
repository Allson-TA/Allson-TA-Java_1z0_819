package p26;

public class Exam {

	/*
	ServiceLoader 是 Java 提供的一個機制，用於在運行時動態地加載服務。這個概念是基於 Java 的服務提供者接口（SPI），允許應用程式在不知道具體類的情況下，透過一個接口（介面）訪問其實現。這種模式特別適合於插件或模塊化系統，讓核心應用程式可以輕鬆擴展功能。

	使用 ServiceLoader 的步驟：
	1. 定義一個服務接口：這是其實現將要實現的接口。
	2. 實現服務接口：一個或多個實現該接口的類。
	3. 註冊服務提供者：在 META-INF/services 目錄下創建一個以接口全名命名的文件，文件內容是實現該接口的類的全名。
	4. 使用 ServiceLoader 加載服務：應用程式透過 ServiceLoader 加載並訪問服務。
	*/

}

/*
Having created the loader for a service with a Print interface and a loader of ServiceLoader<Print> type, which code fragment calls the Print.print(String message) method?
已經為具有 Print 介面的服務和類型為 ServiceLoader<Print> 的加載器創建了加載器，哪個程式碼片段調用了 Print.print(String message) 方法？

A. for(Print p : loader.service()) {
       p.print(message);
   }

B. loader.print(message);

C. try {
       Iterator<Print> printers = loader.iterator();
       while(printers.hasNext()) {
           Print printer = printers.next();
           printer.print(message);
       }
   } catch(ServiceConfigurationError serviceError) {
       ...
   }

D. try {
       Print printer = loader.getPrint();
       printer.print(message);
   } catch(ServiceConfigurationError serviceError) {
       ...
   }
*/
