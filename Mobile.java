public class Mobile{
	
	int price;
    int discountInpercent;
    String name;
    String os;
    String color;
    int ram;

    // No-Argument Constructor
    Mobile() {
        System.out.println("Constructor invoked");
    }

    // Parameterized Constructor
    Mobile(int price, int discountInpercent, String name, String os, String color, int ram) {
        this.price = price;
        this.discountInpercent = discountInpercent;
        this.name = name;
        this.os = os;
        this.color = color;
        this.ram = ram;
    }
	
}