package org.example.tasksB.tour.tourTasks;

public abstract class Tour {
    public String type;
    private String transport;
    private boolean food;
    private int numberOfDays;
    private int cost;
	    
    public Tour(int cost,String transport,boolean food,int numberOfDays) {
        this.cost = cost; 
        this.transport=transport;
        this.food=food;
        this.numberOfDays=numberOfDays;
    }
	
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
      
    public boolean getFood(){
        return food;
    }
    
    public String getTransport(){
        return transport;
    }
    public void setTransport(String transport) {
        this.transport=transport;
    }
    public String getType(){
        return type;
    }
    public void setType(String type) {
        this.type=type;
    }
      
    public int getNumberOfDays(){
        return numberOfDays;
    }
    
    public void setFood(boolean food){
        this.food=food;
    }
    public void setNumberOfDays(int numberOfDays){
        this.numberOfDays=numberOfDays;
    }
    
    @Override
    public String toString() {
        return " |Transport: "+transport+" |Food : "+food+" |Number of days: "+numberOfDays+" |Cost: " + cost + ".";
    }
}
