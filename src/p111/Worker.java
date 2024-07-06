package p111;

public class Worker {
	private boolean ready = true;
	public synchronized boolean isReady() {
		return ready;
	}
	
	public synchronized void work(Worker other , Resource resource) {
		while(ready) {
			while(resource.owner != this) {
				try {
					wait(10);
				} catch (InterruptedException e) {
				}
			}
			if(other.isReady()) {
				resource.owner = other;
			}else {
				//	do work with resource
				ready = false;
				resource.owner = other;
			}
		}
	}
}
