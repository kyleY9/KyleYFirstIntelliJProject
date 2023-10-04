public class Milk {

    // instance variables
    private String typeOfMilk;
    private boolean vegan;
    private String originOfMilk;

    // constructors
    public Milk() {
        typeOfMilk = "unknown";
        vegan = false;
        originOfMilk = "unknown";
    }

    public Milk(String type, boolean veg, String origin) {
        typeOfMilk = type;
        vegan = veg;
        originOfMilk = origin;
    }

    // getter methods
    public String getType() {
        return typeOfMilk;
    }

    public boolean getVeg() {
        return vegan;
    }

    public String getOrigin() {
        return originOfMilk;
    }

    // setter methods

    public void setType(String type) {
        typeOfMilk = type;
    }

    public void setVeg(boolean veg) {
        vegan = veg;
    }

    public void setOrigin(String origin) {
        originOfMilk = origin;
    }

    // other methods that mimic behaviors

    public void introduce() {
        System.out.println("Hi! I am " + typeOfMilk + ", and I originate from " + originOfMilk + "!");
    }

    public void isItVegan() {
        if (vegan == false) {
            System.out.println("I am a non-vegan milk, meaning I come from an animal!");
        } else {
            System.out.println("I am a vegan milk, meaning I come from a vegetarian source!");
        }
    }

    public void inform() {
        System.out.println("Milk, whichever type it is, is full of nutrients and protein! Drink at least one cup per day to improve bone, heart, and immune health!");
    }
}
