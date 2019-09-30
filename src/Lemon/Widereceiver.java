package Lemon;

public class Widereceiver extends Player {

    private double receivingYrds;
    private double targets;
    private double receptions;

    //contructor
    public Widereceiver(String name, String number, String position, double receivingYrds, double targets, double receptions) {
        super(name, number, position);
        this.receivingYrds = receivingYrds;
        this.targets = targets;
        this.receptions = receptions;
    }

    // Getter and Setters
    public double getReceivingYrds() {
        return receivingYrds;
    }

    public void setReceivingYrds(double receivingYrds) {
        this.receivingYrds = receivingYrds;
    }

    public double getTargets() {
        return targets;
    }

    public void setTargets(double targets) {
        this.targets = targets;
    }

    public double getReceptions() {
        return receptions;
    }

    public void setReceptions(double receptions) {
        this.receptions = receptions;
    }
}
