package lo_functional_programming.battle;

import java.util.List;
import java.util.function.Function;

public class TestShips {

    public static Function<String, BattleShip> funcBattleShip =
            sLine -> new BattleShip(Utils.parseCVLine(sLine));

    public static void main(String[] args) {

//        List<BattleShip> alShips = Utils.genListLoad("data_files/Battleships.csv", csvLine -> new BattleShip(Utils.parseCVLine(csvLine)));
        List<BattleShip> alShips = Utils.genListLoad("data_files/Battleships.csv", funcBattleShip);

        // count of all battleships
        System.out.printf("Total ships : %d\n", alShips.size());

        // count of battleships of a particular type
        System.out.printf("Total 'Fast Battleship' ships : %d\n",
                alShips.stream()
                        .filter(battleShip -> battleShip.getShipType().equals("fast battleship"))
                        .count()
        );

        // count the number of ships that have a displacement greater than 4000 tons


        // count the number of Ships in the Royal Navy

        // display all ships from royal navy [sorted]


    }

}
