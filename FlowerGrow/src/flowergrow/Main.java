package flowergrow;

import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		System.out.println("oy, my freedom is defined by growing flowers!!");
		// Petal a=new Petal(Type.DAFFODIL);

		/// Initially asking user to pick the flower
		System.out.println("Which Petal you would like to grow?");

		Type[] types = Type.values();

		// Iterate over the array of petal enum constants
		for (int i = 0; i < types.length; i++) {
			System.out.println(i + 1 + ". " + types[i]);
		}
		System.out.println();
		Scanner scanner = new Scanner(System.in);
		/// take the input from user
		String petalType = scanner.nextLine().toUpperCase();

		// Check if the petal matches any of the enum decleared petals
		try {
			Type type = Type.valueOf(petalType);
			Petal a = new Petal(type);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid input. Please enter one of the flower types.");
		}

		scanner.close();
	}
}
