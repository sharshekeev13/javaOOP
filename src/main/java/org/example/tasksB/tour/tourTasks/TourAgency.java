
package org.example.tasksB.tour.tourTasks;

import org.example.tasksB.tour.client.Client;
import org.example.tasksB.tour.client.Vacation;
import org.example.tasksB.tour.relax.Cruise;
import org.example.tasksB.tour.relax.Excursions;
import org.example.tasksB.tour.relax.Shopping;
import org.example.tasksB.tour.relax.Therapy;

import java.util.Map;
import java.util.HashMap;

public class TourAgency{
         
    public static Client defineClient(String clientName){
        Map<String,Client> clients=new HashMap<>();
   
        clients.put("tom",new Client("Tom",20,"80536573423"));
        clients.put("nik",new Client("Nik",35,"80438795644"));
        clients.put("ann",new Client("Ann",27,"67867678764"));
        clients.put("jon",new Client("Jon",24,"78945365454"));
        clients.put("mary",new Client("Mary",25,"6767676761"));
        
        return clients.get(clientName);
   }
    
    public static Tour defineTour(String tourType){
        
        Map<String,Tour> tours=new HashMap<>();
   
        tours.put("vacation",new Vacation(120,"train",true,5));
        tours.put("excursions",new Excursions(250,"bus",false,2));
        tours.put("therapy",new Therapy(300,"airplane",true,10));
        tours.put("shopping",new Shopping(200,"bus",false,2));
        tours.put("cruise",new Cruise(400,"ship",true,14));
   
        return tours.get(tourType);
   
    }
   
    
    
}
