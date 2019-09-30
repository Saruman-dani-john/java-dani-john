package Lemon;

public class Quarterback extends Player {

    private double passingYrds;
    private double rushingYrds;
    private double passingAttempts;
    private double passingCompletions;

    // constructor


    public Quarterback(String name, String number, String position, double passingYrds, double rushingYrds, double passingAttempts, double passingCompletions) {
        super(name, number, position);
        this.passingYrds = passingYrds;
        this.rushingYrds = rushingYrds;
        this.passingAttempts = passingAttempts;
        this.passingCompletions = passingCompletions;
    }

    // Getter and Setters
    public double getPassingYrds() {
        return passingYrds;
    }

    public void setPassingYrds(double passingYrds) {
        this.passingYrds = passingYrds;
    }

    public double getRushingYrds() {
        return rushingYrds;
    }

    public void setRushingYrds(double rushingYrds) {
        this.rushingYrds = rushingYrds;
    }

    public double getPassingAttempts() {
        return passingAttempts;
    }

    public void setPassingAttempts(double passingAttempts) {
        this.passingAttempts = passingAttempts;
    }

    public double getPassingCompletions() {
        return passingCompletions;
    }

    public void setPassingCompletions(double passingCompletions) {
        this.passingCompletions = passingCompletions;
    }
}
