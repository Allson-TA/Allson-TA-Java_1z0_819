package p63;

import java.io.Serializable;
import java.util.List;

public class Box implements Serializable {
	
	private int boxId;
	private String size;
	private List items;
	
	public Box(int boxId, String size, List items) {
		super();
		this.boxId = boxId;
		this.size = size;
		this.items = items;
	}
	public int getBoxId() {
		return boxId;
	}
	public void setBoxId(int boxId) {
		this.boxId = boxId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public List getItems() {
		return items;
	}
	public void setItems(List items) {
		this.items = items;
	}
	
}


