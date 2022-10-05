package org.example.tasksB.newYearGift.candies;

import org.apache.log4j.Logger;

import com.hometask.calculations.MyException;
import com.hometask.giftbox.Gift;

public class Confection {
	
	private	String name;
	private double cost;
	private double weight;
	private String type;
	final static Logger log = Logger.getLogger(Gift.class);
	
	public Confection (String name, double cost, double weight, String type){
		this.name = name;
		this.cost = cost;
		this.weight = weight;
		this.type = type;
	}

	public Confection() {}

	public String getName() {
		if (name.isEmpty() || name == null) { 
			log.error("Incorrect name data. Field is empty");
			throw new IllegalArgumentException("Check the Name! Name field cannot be empty");
	    }
		return name;
		
	}

	public double getCost() {
		if (cost < 0) {
			log.error("Incorrect weight data (negative or missing digits)");
			throw new IllegalArgumentException("Check the cost! Cost must be nonnegative");
			
	    }
		return cost;
	}

	public double getWeight() throws MyException {
		if (weight <= 0) {
			log.error("Negative Weigt value");
			throw new MyException("Negative Weigt value");
	    }
		return weight;
	}
	
	public String getType() {
		if (type.isEmpty() || type == null) {
			log.error("Incorrect name data. Field is empty");
			throw new IllegalArgumentException("Check the type! Type field cannot be empty");
	    }
		return type;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setType(String type) {
		this.type = type;
	}
	
		
}
