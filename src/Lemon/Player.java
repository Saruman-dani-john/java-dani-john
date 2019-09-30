package Lemon;

public class Player {

    private String name;
    private String number;
    private String position;


    // constructor
    public Player(String name, String number, String position) {
        this.name = name;
        this.number = number;
        this.position = position;
    }

    // Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
