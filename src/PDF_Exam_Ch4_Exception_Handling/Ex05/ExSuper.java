package PDF_Exam_Ch4_Exception_Handling.Ex05;

public class ExSuper extends Exception {

	private final int eCode;
	
	public ExSuper(int eCode,Throwable cause) {
		super(cause);
		this.eCode = eCode;
	}
	
	public ExSuper(int eCode,String msg,Throwable cause) {
		super(msg,cause);
		this.eCode = eCode;
	}
	
	public String getMessage() {
		return this.eCode+":"+super.getMessage()+"_"+this.getCause().getMessage();
	}
}
