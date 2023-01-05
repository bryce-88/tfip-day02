package sdf;

public class Porsche extends Car {

    private String turbo = "off";
    private int accelerate = 0;

    //to call parents' method, use the suffix 'super.'
    //do this because in Porsche class the setter method does nothing [line 24]
    //override
    public Porsche() {
        super.setColour("red");
    }

    public Porsche(String colour, String registration) {
        setColour(colour);
        setRegistration(registration);
    }

    public String getTurbo() {
        return turbo;
    }

    //setter such that colour cannot be changed once instantiated -> could be business requirement
    @Override
    public void setColour(String c) { }

    public void accelerate() {
        this.accelerate++;
        if (this.accelerate > 4) {
            this.turbo = "on";
        }
    }
    
    public void decelerate() {
        this.accelerate--;
        if (this.accelerate <= 4) {
            this.turbo = "off";
        }
    }

}
