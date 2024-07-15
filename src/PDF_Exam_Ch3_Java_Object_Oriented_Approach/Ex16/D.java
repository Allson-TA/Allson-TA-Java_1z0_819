package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex16;

public interface D extends B,C{

}
/*
why does D cause a compilation error?
為什麼D會導致編譯錯誤？

A) D does not define any method.
D 沒有定義任何方法。

B) D inherits a() only from C.
D 僅從 C 繼承了 a()。

C) D inherits a() from B and C but the return types are incompatible.
D 從 B 和 C 繼承了 a()，但返回類型不兼容。

D) D extends more than one interface.
D 擴展了多個接口。
*/
