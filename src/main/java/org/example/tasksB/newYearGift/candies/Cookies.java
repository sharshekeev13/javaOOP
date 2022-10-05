package org.example.tasksB.newYearGift.candies;

public class Cookies extends Confection {
	private int count;
	
	public Cookies(String name, double cost, double weight, String type, int count){
		super(name, cost, weight, type);
	}

	public int getCount() {
		return count;
	}

}
