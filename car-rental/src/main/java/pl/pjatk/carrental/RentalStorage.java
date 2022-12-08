package pl.pjatk.carrental;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {
    private List<Rental> rentalList = new ArrayList<Rental>();

    public boolean isCarAvailable(String vin) {
        for (Rental rental : rentalList) {
            if (rental.getCar().getVin().equalsIgnoreCase(vin)){
                return false;
            }
        }
        return true;
    }
    public List<Rental> getRentalList() {
        return rentalList;
    }
    public void addNewRental(Rental rental) {
        rentalList.add(rental);
    }
}
