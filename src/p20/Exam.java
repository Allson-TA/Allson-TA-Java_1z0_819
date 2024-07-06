package p20;

public class Exam {

}

/*
Which module-info.java is correct for a service provider for a print service defined in the PrintServiceAPI module?
哪個 module-info.java 對於在 PrintServiceAPI 模組中定義的列印服務提供者是正確的？

A.
module PrintServiceProvider {
    requires PrintServiceAPI;
    exports org.printservice.spi;
}

B.
module PrintServiceProvider {
    requires PrintServiceAPI;
    uses com.provider.PrintService;
}

C.	//	exports 用於導出包，而不是用於聲明服務提供者。
module PrintServiceProvider {
    requires PrintServiceAPI;
    exports org.printservice.spi.Print with com.provider.PrintService;
}

D.	//	在JAVA平台模組系統中，當我們設定一個模組為服務提供者時，需要使用provides...with...語法，這方法允許一個抹組宣告他提供某個服務的據理實現
module PrintServiceProvider {
    requires PrintServiceAPI;
    provides org.printservice.spi.Print with com.provider.PrintService;
}
*/

