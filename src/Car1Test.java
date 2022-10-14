
public class Car1Test {

	public static void main(String[] args) {
//		Car1 c = new Car1();
//		c.color = "red";
//		c.gearType = "Auto";
//		c.door = 4;
//		
//		System.out.println(c.color);
//		System.out.println(c.gearType);
//		System.out.println(c.door);
//		
//		
//		
//		Car1 c2 = new Car1();
//		System.out.println(c2.color);
//		System.out.println(c2.gearType);
//		System.out.println(c2.door);
		
		// 오버로딩 활용한 것 
		Car1 c3 = new Car1("red");
		System.out.println(c3.color);
		System.out.println(c3.gearType);
		System.out.println(c3.door);	
		System.out.println("===========");
		
		Car1 c4 = new Car1("blue", "auto");
		System.out.println(c4.color);
		System.out.println(c4.gearType);
		System.out.println(c4.door);	
		System.out.println("===========");
		
		Car1 c5 = new Car1("yellow", "stick", 9);
		System.out.println(c5.color);
		System.out.println(c5.gearType);
		System.out.println(c5.door);	

	}

}
