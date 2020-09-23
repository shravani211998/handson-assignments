package com.hsbc.collection.assinment1;

import java.util.Comparator;


public class ItemSortingDemo {
	
	
	
	 class SortItemByIdAscending implements Comparator<Item>{
		 @Override
		 public int compare(Item i1, Item i2) {
			 return i1.getItemId()-i2.getItemId();
			 
			 
		 }
		 
		 
		 
	 }
	 
	 
     class SortItemByIdDescending implements Comparator<Item>{
    	 @Override
		 public int compare(Item i1, Item i2) {
			 return i2.getItemId()-i1.getItemId();
			 
			 
		 }
		 
		 
		 
		 
	 }
     
     
     
     class SortItemByNameAscending implements Comparator<Item>{
    	 @Override
    	 public int compare(Item i1, Item i2) {
    		 
    		 return i1.getItemName().compareTo(i2.getItemName());
    	 }
		 
		 
		 
	 }
	 
	 
     class SortItemByNameDescending implements Comparator<Item>{
    	 @Override
    	 public int compare(Item i1, Item i2) {
    		 
    		 return i2.getItemName().compareTo(i1.getItemName());
    	 }
		 
		 
		 
	 }
     
     
     
     class SortItemByPrizeAscending implements Comparator<Item>{
    	 @Override
    	 public int compare(Item i1, Item i2) {
    		 
    		 return i1.getPrize().compareTo(i2.getPrize());
    	 }
		 
		 
		 
	 }
	 
	 
     class SortItemByPrizeDescending implements Comparator<Item>{
    	 @Override
    	 public int compare(Item i1, Item i2) {
    		 
    		 return i2.getPrize().compareTo(i1.getPrize());
    	 }
		 
    	 
		 
		 
		 
	 }
     
     
     
     class SortItemByRatingAscending implements Comparator<Item>{
    	 @Override
    	 public int compare(Item i1, Item i2) {
    		 
    		 return i1.getRating()-i2.getRating();
    	 }
		 
		 
		 
	 }
	 
	 
     class SortItemByRatingDescending implements Comparator<Item>{
    	 @Override
    	 public int compare(Item i1, Item i2) {
    		 
    		 return i2.getRating()-i1.getRating();
    	 }
		 
		 
		 
		 
	 }


     



}
