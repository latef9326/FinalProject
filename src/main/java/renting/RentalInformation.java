package renting;

import customer.data.Customer;
import vehicle.data.Vehicle;

import java.time.LocalDateTime;

public class RentalInformation {
    private String operationId;
    private Vehicle vehicle;
    private Customer customer;
    private int duration; //in days
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;

}
