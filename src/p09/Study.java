package p09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Study {

	public static void main(String[] args) {
		
		//	可變集合
		List<String> list1 = new ArrayList<>();
		list1.add("甲");
		list1.add("乙");
		list1.add("丙");
		
		//	不可些改集合
		List<String> list2 = Collections.unmodifiableList(list1);
		//	list2.add("丁");	//	不可以進行元素更新，刪減或排序
		list1.add("丁");		//	不過可以透過 list1 來增加元素
				
		//	不可變集合
		List<String> list3 = List.copyOf(list2);
		list1.add("丁");	//	list3不會受影響，但list1會新增，list因為copy的關係指向同個陣列，所以list1&2都會是甲,乙,丙,丁
		
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println("list3:" + list3);
		

	}

}
