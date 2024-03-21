package lo_inheritance;

public class Ambulance extends Vehicle implements EmergencyVehicles {

    private String sirenColors;

    public Ambulance() {
    }

    public Ambulance(String name) {
        super(name);
    }

    public String getSirenColors() {
        return sirenColors;
    }

    public void setSirenColors(String sirenColors) {
        this.sirenColors = sirenColors;
    }

    @Override
    public String toString() {
        return "Ambulance{" +
                "sirenColors='" + sirenColors + '\'' +
                "} " + super.toString();
    }

    @Override
    public String emergencyName() {
        return "Ambulance: " + getName();
    }

    @Override
    public String emergencyWorkingTimes() {
        return "08:00 to 19:00";
    }
}
