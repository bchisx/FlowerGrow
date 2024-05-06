package flowergrow;

import java.util.Scanner;

class Main {
	public static void main(String args[]) {


		System.out.println("oy, my freedom is defined by growing flowers!!");
		// Petal a=new Petal(Type.DAFFODIL);
    
    while(true){
      Background background = new Background(0, 0, "../src/Assets/Background.png");
      /// Initially asking user to pick the flower
      System.out.println("Which Flower would you like to grow?");

      Type[] types = Type.values();

      // Iterate over the array of petal enum constants
      for (int i = 0; i < types.length; i++) {
        System.out.println(i + 1 + ". " + types[i]);
      }

      System.out.println();

      Scanner scanner = new Scanner(System.in);

      /// take the input from user
      String flowerType = scanner.nextLine().toUpperCase();

      // Check if the petal matches any of the enum decleared petals
      try {
        Type type = Type.valueOf(flowerType);
        Flower a = new Flower(type);
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid input. Please enter one of the flower types.");
      }

      scanner.close();
   }
	}
}
