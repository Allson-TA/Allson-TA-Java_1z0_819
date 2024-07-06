package p101;

import java.util.ArrayList;
import java.util.List;

public class Main <T extends Worker> extends Thread {
	
	private List<T> processces = new ArrayList<>();
	public void doProcess(HardWorker w) {
		processces.add(w);
	}
	
	public void run() {
		processces.forEach((p) -> p.doProcess());
	}	
}
/*
What needs to change to make these classes compile and still handle all types of interface Worker?
需要改變什麼才能讓這些類別編譯並仍然處理所有類型的 Worker 介面？

A. Replace Line 2 with private List processes = new ArrayList<>();
   用 private List processes = new ArrayList<>(); 替換第2行;

B. Replace Line 3 with public void doProcess(T w) {
   用 public void doProcess(T w) { 替換第3行;

C. Replace Line 1 with public class Main extends Thread {
   用 public class Main extends Thread { 替換第1行;

D. Replace Line 3 with public void doProcess(Worker w) {
   用 public void doProcess(Worker w) { 替換第3行;
*/
