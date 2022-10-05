
package org.example.tasksB.tour.client;

import java.util.Comparator;

public class Client{
    
    private String clientName;
    private int clientAge;
    private String clientPhoneNumbers;
        
    public Client(String clientName,int clientAge,String clientPhoneNumbers){
        this.clientName=clientName;
        this.clientAge=clientAge;
        this.clientPhoneNumbers=clientPhoneNumbers;
        
    } 
     
    public void setClientName(String clientName){
        this.clientName=clientName;
    }
    public String getClientName(){
        return clientName;
    }
    
    public void setClientAge(int clientAge){
        this.clientAge=clientAge;
    }
    public int getClientAge(){
        return clientAge;
    }
    
    public void setClientPhoneNumbers(String clientPhoneNumbers){
        this.clientPhoneNumbers=clientPhoneNumbers;
    }
    public String getClientPhoneNumbers(){
        return clientPhoneNumbers;
    }
    @Override
    public String toString(){
        return "\nClient Name: "+clientName+" |Age: "+clientAge+" |PhoneNumbers: "+clientPhoneNumbers;
    }
}
