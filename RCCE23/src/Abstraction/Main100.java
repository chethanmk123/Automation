package Abstraction;

 abstract class Home
 {
	 abstract void tv();
 abstract void fridge();
 abstract void Grinder();
	 void washing()
	 {
		 System.out.println("cloth washing");
	 }
	 }
	 class Kitchen extends Home
	 {
		 void tv()
		 {
			 System.out.println("Movies");
	 }
		 void fridge()
		 {
			 System.out.println("Cooling");
		 }
		 void Grinder()
		 {
			 System.out.println("Cooking");
		 }
	 }
 class Main100
 {
	 public static void main(String[] args)
	 {
		Kitchen K=new Kitchen();
		K.washing();
		K.tv();
		K.fridge();
		K.Grinder();
		
	}
 }
 