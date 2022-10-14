package javaproject;

public class S_aTest {

	public static void main(String[] args) {
		
		S_a as = new S_a("black", "Auto", 4, 10, 6);
		
		System.out.println("color = " + as.color);
		System.out.println("gearType = " + as.gearType);
		System.out.println("door = " + as.door);
		System.out.println("a = " + as.a);
		System.out.println("b = " + as.b);
		System.out.println(as.max());
		

	}

}
