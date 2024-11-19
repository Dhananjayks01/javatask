public class Runner{
public static void main(String[] args) {
      
        Mobile mob = new Mobile(30000, 22, "Pixel 6", "Android", "Black", 12);
		Mobile mob1 = new Mobile(10000, 0, " Redmi", "Android", "white", 4);
		Mobile mob2= new Mobile(30000, 30, "realme", "Android", "Black", 8);
		Mobile mob3 = new Mobile(48000, 22, "Samsung", "Android", "Black", 6);

       
        System.out.println("Price: " + mob.price);
        System.out.println("Name: " + mob.name);
        System.out.println("OS: " + mob.os);
        System.out.println("Color: " + mob.color);
        System.out.println("RAM: " + mob.ram + "GB");
		
		
		System.out.println("\nPrice: " + mob1.price);
        System.out.println("Name: " + mob1.name);
        System.out.println("OS: " + mob1.os);
        System.out.println("Color: " + mob1.color);
        System.out.println("RAM: " + mob1.ram + "GB");
		
		System.out.println("\nPrice: " + mob2.price);
        System.out.println("Name: " + mob2.name);
        System.out.println("OS: " + mob2.os);
        System.out.println("Color: " + mob2.color);
        System.out.println("RAM: " + mob2.ram + "GB");
		
		System.out.println("\n Price: " + mob3.price);
        System.out.println("Name: " + mob3.name);
        System.out.println("OS: " + mob3.os);
        System.out.println("Color: " + mob3.color);
        System.out.println("RAM: " + mob3.ram + "GB");
		
    
}
}