package lo_oop;

public class Biometrics {

    private static final String A_POSITIVE = "A+";
    private static final String AB_POSITIVE = "AB+";
    private static final String B_POSITIVE = "B+";
    private static final String B_NEGATIVE = "B-";

    private static final String O_POSITIVE = "O+";
    private static final String O_NEGATIVE = "O-";

    private int weight;     // in lbs
    private int height;     // in cm

    private String bloodGroup;
    private String eyeColour;

    public Biometrics() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    @Override
    public String toString() {
        return "Biometrics{" +
                "weight=" + weight +
                ", height=" + height +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                '}';
    }
}
