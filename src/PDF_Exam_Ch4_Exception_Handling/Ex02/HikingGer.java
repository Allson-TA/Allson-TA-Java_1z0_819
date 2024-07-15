package PDF_Exam_Ch4_Exception_Handling.Ex02;

final class HikingGer implements AutoCloseable {

	@Override
	public void close() throws Exception {
		
		throw new FallenException();
		
	}
	
}
