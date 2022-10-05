
package org.example.tasksB.tour.tourTasks;

import org.example.tasksB.tour.client.Client;
import org.example.tasksB.tour.client.ClientVouchers;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class TourBooking {
    
    public void chooseClient(List<Client> inventory, String client) throws RuntimeException{
       
            Client temp;
        
            temp=TourAgency.defineClient(client);
            if((temp!=null)&&(TourAgency.defineClient(client).getClientName().toLowerCase().equals(client))){
                inventory.add(temp);
            }
            else throw new IllegalArgumentException("We haven't such client "+client);
                        
        }
    
    public void chooseTour(List<Tour> inventory,String...tours) throws RuntimeException{
        Tour temp;
        for(int i=0;i<tours.length;i++){
            temp=TourAgency.defineTour(tours[i]);
            if((temp!=null)&&(TourAgency.defineTour(tours[i]).getType().toLowerCase().equals(tours[i]))){
             inventory.add(temp);
            }
            else 
                throw new IllegalArgumentException("We haven't such tour "+tours[i]);
              
        }
    }
    
     public void sortTourByCost(ClientVouchers voucher){
             
         Collections.sort(voucher.getTour(),new Comparator(){
            public int compare(Object o1,Object o2){
                Tour tour1=(Tour)o1;
                Tour tour2=(Tour)o2;
                if(tour1.getCost()>tour2.getCost()){
                    return 1;
                }
                if(tour1.getCost()<tour2.getCost()){
                    return -1;
                }
                else {
                    return 0;
                }
            }
    });
 }
    
}
