package tasks.second;

import java.util.Objects;

public class Distance {
    private final City v1;
    private  City v2;
    private final int weightOfEdge;

    public Distance(City v1, City v2, int weightOfEdge) {
        this.v1 = v1;
        this.v2 = v2;
        this.weightOfEdge = weightOfEdge;
    }

    public City getV1() {
        return v1;
    }
    public void setV2(City v2) {
        this.v2 = v2;
    }
    public City getV2() {
        return v2;
    }

    public int getWeightOfEdge() {
        return weightOfEdge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance = (Distance) o;
        return weightOfEdge == distance.weightOfEdge &&
                v1.equals(distance.v1) &&
                v2.equals(distance.v2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, weightOfEdge);
    }
}
