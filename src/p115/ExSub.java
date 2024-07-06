package p115;

import java.io.FileNotFoundException;

public class ExSub extends ExSuper {
    public ExSub(int eCode, String msg, Throwable cause) {
        super(eCode, msg, cause);
    
    
    
	try {
	    String param1 = "Oracle";
	    if (param1.equalsIgnoreCase("oracle")) {	//	不分大小寫的比較
	        throw new ExSub(9001, "Application ERROR-9001", new FileNotFoundException("MyFile.txt"));
	    }
	    throw new ExSuper(9001, new FileNotFoundException("MyFile.txt"));  // Line 1
	} catch (ExSuper ex) {
	    System.out.println(ex.getMessage());
	}
    }
}