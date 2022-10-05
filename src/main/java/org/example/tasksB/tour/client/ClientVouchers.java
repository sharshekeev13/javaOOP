 package org.example.tasksB.tour.client;

import org.example.tasksB.tour.tourTasks.Tour;

import java.util.List;

public class ClientVouchers{
    
    private List<Client> clients;
    private List<Tour> tours;
    
    public ClientVouchers(List<Client> clients, List<Tour> tours){
        this.clients=clients;
        this.tours=tours;   
    }
    
    public List<Client> getClient(){
        return clients;
    }
    public void setClient(List<Client> clients){
        this.clients=clients;
    }
    
    public List<Tour> getTour(){
        return tours;
    }
    public void setTour(List<Tour> tours){
        this.tours=tours;
    }
    
      
    @Override
    public String toString(){
        StringBuilder clientDescription=new StringBuilder(clients.get(0).toString());
        if(!tours.isEmpty()){
            clientDescription.append("\n"+clients.get(0).getClientName()+"s tours:");
            for(Tour tour:tours){
                clientDescription.append(new StringBuilder(tour.toString()));
            }
        }
        return new String(clientDescription);
    }    
}
