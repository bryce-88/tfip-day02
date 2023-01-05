package sdf;

public class CarMain {

    public static void main(String[] args) {

        //instantiate an instance of car
        Car c = new Car("grey", "sdf123");
        c.start();
        System.out.printf("Is the car started? %b\n", c.isStarted());

        c.getOutOfMyWay();

        Car d = new Car("red", "sdf321c");
        //d.setColour("red");
        System.out.printf("Color of my car? %s\n", d.getColour());

        Car e = new Car("black", "s1234c");
        System.out.printf("Colour of my car? %s\n", e.getColour());
        System.out.printf("Registration of my car? %s\n", e.getRegistration());

        Porsche p = new Porsche();
        System.out.printf("What is the colour of my Porsche? %s\n", p.getColour());
        p.setColour("pink");
        System.out.printf("What is the colour of my Porsche now? %s\n", p.getColour());

    }
    
}
