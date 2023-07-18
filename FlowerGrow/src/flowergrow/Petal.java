package flowergrow;

public class Petal {
	private int length;
	private int height;
	private String type;
	
	public Petal(Type type) {
		switch(type) {
	      case TULIP:
	        System.out.println("is a tulip");
	        break;
	      case POPPY:
	         System.out.println("is a poppy");
	        break;
	      case DAFFODIL:
	        System.out.println("is a daffodil");
	        break;
	      case SUNFLOWER:
	    	System.out.println("is a sunflower");    }
	}
}
