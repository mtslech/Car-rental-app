package pl.pjatk.carrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class CarRentalApplication {
	public CarRentalApplication(CarService carService, RentalStorage rentalStorage){
		List<Rental> allRents = rentalStorage.getRentalList();

		System.out.println(carService.rentCar(new User(2),"SF1000ITA", LocalDate.of(2022,11,26), LocalDate.of(2023,11,29)));
		System.out.println(allRents);
	}

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}

}
