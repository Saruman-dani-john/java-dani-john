package Lemon;

public class Runningback extends Player {

    private double rushingYrds;

    // contructor


    public Runningback(String name, String number, String position, double rushingYrds) {
        super(name, number, position);
        this.rushingYrds = rushingYrds;
    }

    // Getter and Setters
    public double getRushingYrds() {
        return rushingYrds;
    }

    public void setRushingYrds(double rushingYrds) {
        this.rushingYrds = rushingYrds;
    }
}
