package lo_functional_programming.battle;

class ShipConstants {
    public static int NAME = 0;
    public static int OPERATING_NAVY = 1;
    public static int SHIP_TYPE = 2;
    public static int DISPLACEMENT = 3;
    public static int BUILD_YEAR = 4;
    public static int END_OF_SERVICE = 5;
}

public class BattleShip {
    private final String name;
    private final String operatingNavy;
    private final String shipType;
    private final int displacement;
    private final int buildYear;
    private final int endOfService;

    public BattleShip(String[] sArgs) {

        name = sArgs[ShipConstants.NAME].trim();

        operatingNavy = sArgs[ShipConstants.OPERATING_NAVY].trim().replaceAll("[^A-Za-z\\s]", "");

        shipType = sArgs[ShipConstants.SHIP_TYPE].trim();

        displacement = Integer.parseInt(sArgs[ShipConstants.DISPLACEMENT].replace(",", ""));

        buildYear = Integer.parseInt(sArgs[ShipConstants.BUILD_YEAR].split("-")[2]);

        endOfService = Integer.parseInt(sArgs[ShipConstants.END_OF_SERVICE].split("-")[2]);
    }


    //Getters

    public String getName() {
        return name;
    }

    public String getOperatingNavy() {
        return operatingNavy;
    }

    public String getShipType() {
        return shipType;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public int getEndOfService() {
        return endOfService;
    }

    @Override
    public String toString() {
        return String.format("Ship: %-20s " +
                        "Navy:%-20s " +
                        "Type: %-30s " +
                        "Displacement: %-10d " +
                        "Build Year: %-5d  " +
                        "End of Service: %-5d",
                name, operatingNavy, shipType, displacement, buildYear, endOfService);
    }

}
