package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex02;

abstract class Ball { // 定義一個抽象類Ball
    protected final int size; // 定義一個受保護的最終變量size
    public Ball(int size) { // 定義一個構造函數，接受一個int類型的參數
        this.size = size; // 初始化size變量
    }
}

interface Equipment {} // 定義一個空接口Equipment


/*
What is the output of the following application? 以下應用程序的輸出是什麼？
A. 5
B. The code does not compile due to an invalid cast 程式碼因為無效的轉換而無法編譯
C. The code does not compile for a different reason 程式碼因其他原因無法編譯
D. The code compiles but throws a ClassCastException at runtime 程式碼編譯通過但在運行時拋出 ClassCastException 異常
*/