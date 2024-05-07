package flowergrow;

import java.util.HashMap;
import java.util.Map;

//for conventions, consider implementing setter method
public class Flower {
  private Leaf leaf;
  private Stem stem;
  private ThePot pot;
  private Petal petal;
  private Type flowerType;

  /// this will represent the parts of flower
  private Map<String, FlowerPart> parts;

  public Flower(Type type) {
    this.flowerType = type;
    switch (type) {
      case TULIP:
        this.parts = new HashMap<>();
        /// include all the parts that are required to grow tulip
        this.parts.put("stem", new FlowerPart());
        this.parts.put("leaf", new FlowerPart());
        break;
      case POPPY:
        this.parts = new HashMap<>();
        /// include all the parts that are required to grow poppy
        this.parts.put("stem", new FlowerPart());
        this.parts.put("leaf", new FlowerPart());
        break;
      case DAFFODIL:
        this.parts = new HashMap<>();
        /// include all the parts that are required to grow daffodil
        this.parts.put("stem", new FlowerPart());
        this.parts.put("leaf", new FlowerPart());
        break;
      case SUNFLOWER:
        this.parts = new HashMap<>();
        /// include all the parts that are required to grow sunflower
        this.parts.put("stem", new FlowerPart());
        this.parts.put("leaf", new FlowerPart());
        break;
    }
  }

  public Type getFlowerType() {
    return flowerType;
  }

  /// Method to update the growth stage of all parts of flower
  public void update() {
    /// Implementation to update growth stage of all parts
    /// For testing purposes, currently using print statements
    for (Map.Entry<String, FlowerPart> entry : parts.entrySet()) {
      FlowerPart part = entry.getValue();
      int currentStage = part.getGrowthStage();
      /// increment growth stage
      part.setGrowthStage(currentStage + 1);
      System.out
          .println("Part: " + entry.getKey() + ", Growth Stage Image: " + part.getImage(entry.getKey(), flowerType));
    }
  }
}
