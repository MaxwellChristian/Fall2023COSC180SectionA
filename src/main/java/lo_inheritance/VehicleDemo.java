package lo_inheritance;

import java.util.ArrayList;
import java.util.Collections;

public class VehicleDemo {

    public static void main(String []args) {

        Helicopter h1 = new Helicopter();
        Helicopter h2 = new Helicopter();

        Vehicle v1 = new Helicopter();
        Vehicle v2 = new Helicopter();
        Vehicle v3 = new Ambulance();
        v3 = h1;

        EmergencyVehicles e1 = new Helicopter();

        if( h1.equals(v3) ){

        }

        if( h1.compareTo(h2) > 0 ){

        }

        ArrayList<Helicopter> alHelicopters = new ArrayList<>();


    }

}
