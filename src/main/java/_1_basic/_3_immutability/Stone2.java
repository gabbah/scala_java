package _1_basic._3_immutability;

import java.util.ArrayList;
import java.util.List;

/**
 * Immutable
 */
public class Stone2 {
    private final Double volume;
    private final Double weight;
    private final String color;
    private final String rockType;
    private final List<String> minerals;

    public Double getVolume() {
        return volume;
    }

    public Double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getRockType() {
        return rockType;
    }

    public List<String> getMinerals() {
        return new ArrayList<>(minerals);
    }
    

    public Stone2(Double volume, Double weight, String color, String rockType, List<String> minerals) {
        this.volume = volume;
        this.weight = weight;
        this.color = color;
        this.rockType = rockType;
        this.minerals = minerals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stone2 stone = (Stone2) o;

        if (volume != null ? !volume.equals(stone.volume) : stone.volume != null) return false;
        if (weight != null ? !weight.equals(stone.weight) : stone.weight != null) return false;
        if (color != null ? !color.equals(stone.color) : stone.color != null) return false;
        return rockType != null ? rockType.equals(stone.rockType) : stone.rockType == null;
    }

    @Override
    public int hashCode() {
        int result = volume != null ? volume.hashCode() : 0;
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (rockType != null ? rockType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "volume=" + volume +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", rockType='" + rockType + '\'' +
                '}';
    }
    
    public Stone2 withRockType(String newRockType) {
        return new Stone2(volume, weight, color, newRockType, new ArrayList<>(minerals));
    }
    
    public Stone2 withColor(String newColor) {
        return new Stone2(volume, weight, newColor, rockType, new ArrayList<>(minerals));
    }
    
    public Stone2 withVolume(Double newVolume) {
        return new Stone2(newVolume, weight, color, rockType, new ArrayList<>(minerals));
    }
    
    public Stone2 withVWeight(Double newWeight) {
        return new Stone2(volume, newWeight, color, rockType, new ArrayList<>(minerals));
    }
    
    public Stone2 withMinerals(List<String> newMineralsList) {
        return new Stone2(volume, weight, color, rockType, newMineralsList);
    }
    
    public Stone2 addingMineral(String mineral) {
        List<String> newMineralsList = new ArrayList<>(minerals);
        newMineralsList.add(mineral);
        return new Stone2(volume, weight, color, rockType, newMineralsList);
    }
}
