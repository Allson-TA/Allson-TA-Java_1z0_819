package p115;

import java.io.FileNotFoundException;

public class ExSuper extends Exception {

	    private final int eCode;
	    public ExSuper(int eCode, Throwable cause) {
	        super(cause);
	        this.eCode = eCode;
	    }
	    public ExSuper(int eCode, String msg, Throwable cause) {
	        super(msg, cause);
	        this.eCode = eCode;
	    }
	    public String getMessage() {
	        return this.eCode + ": " + super.getMessage() + "-" + this.getCause().getMessage();

	    }	
}
/*
 	What is the result?
	結果是什麼？

	A. 9001: Application ERROR-9001-MyFile.txt
	B. 9001: java.io.FileNotFoundException: MyFile.txt-MyFile.txt
	C. Compilation fails at Line 1
	D. 9001: Application ERROR-9001-MyFile.txt
	   9001: java.io.FileNotFoundException: MyFile.txt-MyFile.txt
*/
