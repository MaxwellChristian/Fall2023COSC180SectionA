package lo_inheritance;

import java.util.Comparator;

public class Helicopter extends Vehicle implements EmergencyVehicles, Comparable<Helicopter>, Comparator<Helicopter> {

    int numberOfBlades;

    public Helicopter() {
    }

    public Helicopter(String name, int numberOfBlades) {
        super(name);
        this.numberOfBlades = numberOfBlades;
    }

    public int getNumberOfBlades() {
        return numberOfBlades;
    }

    public void setNumberOfBlades(int numberOfBlades) {
        this.numberOfBlades = numberOfBlades;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "numberOfBlades=" + numberOfBlades +
                "} " + super.toString();
    }

    @Override
    public int compare(Helicopter o1, Helicopter o2) {
        return o1.numberOfBlades - o2.numberOfBlades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helicopter that = (Helicopter) o;
        return numberOfBlades == that.numberOfBlades;
    }

    @Override
    public String emergencyName() {
        return null;
    }

    @Override
    public String emergencyWorkingTimes() {
        return null;
    }

    @Override
    public int compareTo(Helicopter otherHelicopter) {
        return this.numberOfBlades - otherHelicopter.numberOfBlades;
    }
}
