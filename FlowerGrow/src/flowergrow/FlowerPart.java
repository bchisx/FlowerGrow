package flowergrow;

import java.util.HashMap;

public class FlowerPart {
    private int growthStage;

    public FlowerPart() {
        this.growthStage = 0; /// initializing the initial growth stage
    }

    public int getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(int growthStage) {
        this.growthStage = growthStage;
    }

    /// Method to return the associated part image based on growth stage
    public String getImage(String part, Type flowerType) {
        /// Implementation to return image based on growth stage
        /// You can replace this with actual image loading logic later
        return "assets/" + flowerType + "/" + part + "_" + growthStage + ".png";
    }
}
