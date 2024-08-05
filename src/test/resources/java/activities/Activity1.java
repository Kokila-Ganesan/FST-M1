package activites;


public class Activity1 extends Car{

	public static void main(String[] args) {
		Car c1 = new Car();
        c1.make = 2014;
        c1.color = "Black";
        c1.transmission = "Manual";
    
        //Using Car class method
        c1.displayCharacterstics();
        c1.accelerate();
        c1.brake();

	}

}
