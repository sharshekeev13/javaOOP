package org.example.tasksB.newYearGift.candies;

public class Marshmallow extends Confection {
	private String flavor;
	
	public Marshmallow(String name, double cost, double weight, String type, String flavor){
		super(name, cost, weight, type);
	}

	public String getFlavor() {
		return flavor;
	}

}
