package com.hsbc.collection.assinment1;

public class Item {
	
	private int itemId;
	private String itemName;
	private String prize;
	private int rating;
	
	public Item(int itemId, String itemName, String prize, int rating) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.prize = prize;
		this.rating = rating;
	}
	
	
	
	
	public Item() {
		super();
	}




	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}




	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", prize=" + prize + ", rating=" + rating + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + itemId;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemId != other.itemId)
			return false;
		return true;
	}
	
	
	
	

}
