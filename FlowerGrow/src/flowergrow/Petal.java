package flowergrow;

public class Petal {
	private int length;
	private int height;
	private String type;

	Flower flower;

	public Petal(Type type) {
		switch (type) {
			case TULIP:
				flower = new Flower(type);

				for (int i = 0; i < 5; i++) {
					System.out.println("Updating Flower..." + flower.getFlowerType());
					flower.update();
					System.out.println();
				}

				break;
			case POPPY:
				flower = new Flower(type);

				for (int i = 0; i < 5; i++) {
					System.out.println("Updating Flower..." + flower.getFlowerType());
					flower.update();
					System.out.println();
				}
				break;
			case DAFFODIL:
				flower = new Flower(type);

				for (int i = 0; i < 5; i++) {
					System.out.println("Updating Flower..." + flower.getFlowerType());
					flower.update();
					System.out.println();
				}
				break;
			case SUNFLOWER:
				flower = new Flower(type);

				for (int i = 0; i < 5; i++) {
					System.out.println("Updating Flower..." + flower.getFlowerType());
					flower.update();
					System.out.println();
				}

				break;
		}
	}

}
