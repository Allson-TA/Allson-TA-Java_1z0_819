package p29;

import java.io.FileNotFoundException;

public class CustomerException extends Exception {
    private final int errorCode;

    public CustomerException(int errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    public CustomerException(int errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return String.format("Code: %d - %s[%s]", this.errorCode,
                             super.getMessage(),
                             this.getCause().getMessage());
    }

    public static void main(String[] args) {
        try {
            throw new CustomerException(9001, "APPLICATION ERROR-9001",
                                        new FileNotFoundException("MyFile.txt")); // Line 1
        } catch (CustomerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
/*
What is the result?
結果是什麼？

A. A java.lang.NullPointerException is thrown.
   拋出 java.lang.NullPointerException。

B. Code: 9001 - APPLICATION ERROR-9001[MyFile.txt]

C. The compilation fails at Line 1
   編譯在第 1 行失敗

D. The program prints nothing
   程式無輸出
*/

