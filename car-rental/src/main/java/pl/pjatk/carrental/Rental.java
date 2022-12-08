package pl.pjatk.carrental;

public class Rental {
    User user;
    Car car;

    public Rental(User user, Car car) {
        this.user = user;
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Rental: " + user + " " + car;
    }
}
