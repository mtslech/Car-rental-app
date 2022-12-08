package pl.pjatk.carrental;

public enum CarType {
    STANDARD(1),
    PREMIUM(1.5),
    SPORT(2);
    private final double multiplier;

    CarType(double multiplier) {
        this.multiplier = multiplier;
    }
    public double getMultiplier() {
        return multiplier;
    }
}
