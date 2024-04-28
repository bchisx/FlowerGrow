package flowergrow;

//for conventions, consider implementing setter method
public class Flower {
  private Leaf leaf;
  private Stem stem;
  private ThePot pot;
  private Petal petal;
  
  public Flower(Type type) {
    switch(type) {
      case TULIP:
        leaf=new Leaf(type);
        stem=new Stem(type);
        petal=new Petal(type);
        pot=new ThePot();
        break;
      case POPPY:
        leaf=new Leaf(type);
        stem=new Stem(type);
        petal=new Petal(type);
        pot=new ThePot();
        break;
      case DAFFODIL:
        leaf=new Leaf(type);
        stem=new Stem(type);
        petal=new Petal(type);
        pot=new ThePot();
        break;
      case SUNFLOWER:
        leaf=new Leaf(type);
        stem=new Stem(type);
        petal=new Petal(type);
        pot=new ThePot();
        break;
    }
  }
}
