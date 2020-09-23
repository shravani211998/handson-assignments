package com.hsbc.collection.assinment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ItemDemo {
	
	public static void main(String[] args) {
		
		List<Item> list1 = new ArrayList<Item>();
		
		
		
		list1.add(new Item(9,"Chair", "thousand", 4));
		list1.add(new Item(3,"Apple","twenty", 6));
		list1.add(new Item(5,"Ball", "ten", 3));
		list1.add(new Item(1,"Doll", "fifty", 2));
		list1.add(new Item(7,"Egg", "five", 8));
		
		
		
		System.out.println("Size : "+list1.size());
		
		
		for(Item list : list1 ) {
			
			System.out.println(list);
			
		}
		
		ItemSortingDemo item = new ItemSortingDemo();
		
		Collections.sort(list1, item.new SortItemByIdAscending());
		
		System.out.println("After Sorting by ItemId in ascending");
		for(Item list : list1 ) {
			
			System.out.println(list);
			
		}
		
		Collections.sort(list1, item.new SortItemByIdDescending());
		Collections.sort(list1, item.new SortItemByNameAscending());
		System.out.println("After Sorting by Name in ascending");
		for(Item list : list1 ) {
			
			System.out.println(list);
			
		}
		
		
		
		
		
		
		
		
		Collections.sort(list1, item.new SortItemByNameDescending());
		Collections.sort(list1, item.new SortItemByPrizeAscending());
		Collections.sort(list1, item.new SortItemByPrizeDescending());
		Collections.sort(list1, item.new SortItemByRatingAscending());
		Collections.sort(list1, item.new SortItemByRatingDescending());
		
		

		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
