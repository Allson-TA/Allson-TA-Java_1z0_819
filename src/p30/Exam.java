package p30;

public class Exam {

}
/*
Which two Stream methods can be changed to use method references?
哪兩個 Stream 方法可以更改為使用方法引用？

A. .peek(Member::print)	//	這行程式碼在流處理過程中，對每個元素執行 Member::print 操作，通常用於調試或日誌記錄。
B. .filter(Member::getYearsMembership() >= testMembershipLength)	//	這行程式碼過濾流中的元素，只保留會員年限大於或等於 testMembershipLength 的元素。
C. .map(testName::compareToIgnoreCase)	//	這行程式碼將流中的每個元素映射為與 testName 進行忽略大小寫比較的結果。
D. .filter(Integer::equals(0))	//	這行程式碼過濾流中的元素，只保留等於 0 的元素-->.filter(i -> i.equals(0))

*/
