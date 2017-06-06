package basic_3_immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Immutable
 */
public class Stone {
    private final Double volume;
    private final Double weight;
    private final String color;
    private final String rockType;

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

    private <T> List<T> cloneList(List<T> list) {
        List<T> clone = new ArrayList<>();
        Collections.copy(clone, list);
        return clone;
    }

    public Stone(Double volume, Double weight, String color, String rockType) {
        this.volume = volume;
        this.weight = weight;
        this.color = color;
        this.rockType = rockType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stone stone = (Stone) o;

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
    
    public Stone withRockType(String newRockType) {
        return new Stone(volume, weight, color, newRockType);
    }
    
    public Stone withColor(String newColor) {
        return new Stone(volume, weight, newColor, rockType);
    }
    
    public Stone withVolume(Double newVolume) {
        return new Stone(newVolume, weight, color, rockType);
    }
    
    public Stone withVWeight(Double newWeight) {
        return new Stone(volume, newWeight, color, rockType);
    }
}
