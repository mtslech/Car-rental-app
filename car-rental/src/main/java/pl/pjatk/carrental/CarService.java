package pl.pjatk.carrental;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@Component //to co jest componentem ma miec dostep wspoldzielony
public class CarService {
    private final int BASE_PRICE = 300;
    private final CarStorage carStorage; //przy wstrzykiwaniu kozystamy z final
    private final RentalStorage rentalStorage;

    public CarService(CarStorage carStorage, RentalStorage rentalStorage){ //wstrzykujemy zasoby CarStorage
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }
    public List<Car> getAllCars(){
        return carStorage.getCarList();
    }

    public List<Rental> getAllRentals() {
        return rentalStorage.getRentalList();
    }

    public RentalInfo rentCar(User user, String vin, LocalDate startDate, LocalDate endDate) {
        if (rentalStorage.isCarAvailable(vin) && carStorage.isCarExist(vin)) {
            double price = calculatePrice(carStorage.getCarByVin(vin), calculateNumberOfDays(startDate, endDate));
            Rental rental = new Rental(user, carStorage.getCarByVin(vin));
            rentalStorage.addNewRental(rental);
            return new RentalInfo(price, startDate, endDate);
        }
        return null;
    }
    private long calculateNumberOfDays(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
    public double calculatePrice(Car car, long numberOfDays){
        return car.getCarType().getMultiplier() * BASE_PRICE * numberOfDays;
    }
}
