package lo_functional_programming.battle;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestShips {

    public static Function<String, BattleShip> funcBattleShip =
            sLine -> new BattleShip(Utils.parseCVLine(sLine));

    public static void main(String[] args) {

//        List<BattleShip> alShips = Utils.genListLoad("data_files/Battleships.csv", csvLine -> new BattleShip(Utils.parseCVLine(csvLine)));
        List<BattleShip> alShips = Utils.genListLoad("data_files/Battleships.csv", funcBattleShip);

        // count of all battleships
        System.out.printf("Total ships : %d\n", alShips.size());

        // display all the ships
//        for ( BattleShip ship: alShips) {
//            System.out.println(ship);
//        }

        // alternate way to display
//        alShips.forEach(System.out::println);

        // count of battleships of a particular type
        System.out.printf("Total 'Fast Battleship' ships : %d\n",
                alShips.stream()
                        .filter(battleShip -> battleShip.getShipType().equals("fast battleship"))
                        .count()
        );

        // count the number of ships that have a displacement greater than 4000 tons
        System.out.printf("Ships [>4000 tons]: %d\n",
                alShips.stream().filter(battleShip -> battleShip.getDisplacement() > 4000)
                        .count()
        );

        // count the number of Ships in the Royal Navy
        System.out.printf("Ships from 'Royal Navy': %d\n",
                alShips.stream()
                        .filter(battleShip -> battleShip.getOperatingNavy().equals("Royal Navy"))
                        .count()
        );

        System.out.printf("Ships from 'Royal Navy': %d\n",
                alShips.stream()
                        .filter(battleShip -> battleShip.getOperatingNavy().matches(".*Royal Navy"))
                        .count()
        );

        // get all ships from royal navy
        List<BattleShip> royalNavyShips = alShips.stream()
                .filter(battleShip -> battleShip.getOperatingNavy().matches(".*Royal Navy"))
                .toList();

        // get all ships from royal navy as an array list
        ArrayList<BattleShip> alRoyalNavyShips = alShips.stream()
                .filter(battleShip -> battleShip.getOperatingNavy().matches(".*Royal Navy"))
                .collect(Collectors.toCollection(ArrayList::new));


        // display all ships from royal navy [sorted]
        alRoyalNavyShips.stream().sorted().forEach(System.out::println);

        // total displacement of all royal navy ships
        System.out.println("Total displacement [royal navy]: " +
            alRoyalNavyShips.stream()
                    .map(BattleShip::getDisplacement)
                    .reduce(0, Integer::sum)
        );

    }

}
