package sdf;

public class Car {

    //members
    private String registration;
    private String colour;
    private int year;
    private boolean started;

    //constructor
    public Car(String colour, String registration) {
        this.colour = colour;
        this.registration = registration;
    }

    public Car () {
    }


    //getters and setters
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String r) {
        this.registration = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    //methods
    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public void getOutOfMyWay() {
        System.out.println("HONK!...");
    }
    
}
