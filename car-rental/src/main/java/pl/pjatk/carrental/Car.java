package pl.pjatk.carrental;

public class Car {
    private String manufacture;
    private String model;
    private String vin;
    private CarType carType; //enum

    public String getManufacture() {
        return manufacture;
    }

    public String getModel(){
        return model;
    }

    public String getVin() {
        return vin;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    Car(String manufacture,String model, String vin, CarType carType){
        this.manufacture = manufacture;
        this.model = model;
        this.vin = vin;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", carType=" + carType +
                '}';
    }
}
