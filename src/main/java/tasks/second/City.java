package tasks.second;

import java.util.Objects;

public class City {
    private final String name;
    private int minWeight;
    private int weightToCompare;
    private boolean isChecked;

    public City(String name) {
        this.name = name;
        minWeight = Integer.MAX_VALUE;
        weightToCompare = Integer.MAX_VALUE;
        isChecked = false;
    }

    public String getName() {
        return name;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    public int getWeightToCompare() {
        return weightToCompare;
    }

    public void setWeightToCompare(int weightToCompare) {
        this.weightToCompare = weightToCompare;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return name.equals(city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
