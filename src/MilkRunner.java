public class MilkRunner {
    public static void main(String [] args) {
        // object instantiation
        Milk milk1 = new Milk();

        // setting attributes to replace default values
        milk1.setType("soy milk");
        milk1.setVeg(true);
        milk1.setOrigin("soy");

        // getting values of object "milk1"
        System.out.println("Milk Type: " + milk1.getType());
        System.out.println("Vegan? " + milk1.getVeg());
        System.out.println("Origin of Milk: " + milk1.getOrigin());

        // calling methods
        milk1.introduce();
        milk1.isItVegan();
        milk1.inform();
    }
}
