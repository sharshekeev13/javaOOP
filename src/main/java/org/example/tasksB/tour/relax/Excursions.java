package org.example.tasksB.tour.relax;

import org.example.tasksB.tour.tourTasks.Tour;

public class Excursions extends Tour {
       
    public Excursions(int cost,String transport,boolean food,int numberOfDays){
        super(cost,transport,food,numberOfDays);
        this.type="excursions";
    }
    
       
    @Override
    public String toString(){
        return "\n"+"Tour type: "+type+super.toString();
    }
}

