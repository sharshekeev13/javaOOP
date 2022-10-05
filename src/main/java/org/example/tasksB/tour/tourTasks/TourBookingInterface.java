package org.example.tasksB.tour.tourTasks;

import org.example.tasksB.tour.client.Client;
import org.example.tasksB.tour.client.ClientVouchers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public interface TourBookingInterface {

    default void chooseClient(List<Client> inventory, String client) throws RuntimeException{}

    default void chooseTour(List<Tour> inventory,String...tours) throws RuntimeException{}

    default void sortTourByCost(ClientVouchers voucher){}

}
