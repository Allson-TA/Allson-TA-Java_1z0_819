package p33;

import java.util.List;
import java.util.Optional;

class Item {
	
	public String name;
	public int amount;
	public Item (String name , int amount) {
		this.name = name;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", amount=" + amount + "]";
	}
}
	



	


