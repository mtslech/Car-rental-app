package pl.pjatk.carrental;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarStorage {
    private List<Car> carList = new ArrayList<Car>();

    public CarStorage(){
        carList.add(new Car("Ferrari","488","SF1000ITA", CarType.SPORT)); //mozna zaimportowac aby nie pisac CarType.TYP
        carList.add(new Car("Alfa Romeo","Brera","AR5000ITA", CarType.STANDARD));
        carList.add(new Car("Mercedes","S Class","MR9000GER", CarType.PREMIUM));
    }

    public boolean isCarExist(String vin) {
        for (Car car : carList) {
            if (car.getVin().equalsIgnoreCase(vin)){
                return true;
            }
        }
        return false;
    }

    public Car getCarByVin(String vin) {
        for (Car car : carList) {
            if (car.getVin().equalsIgnoreCase(vin)) {
                return car;
            }
        }
        return null;
    }
    public List<Car> getCarList() {
        return carList;
    }
}
