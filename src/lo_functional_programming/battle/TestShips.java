package lo_functional_programming.battle;

import java.util.List;
import java.util.function.Function;

public class TestShips {

    public static Function<String, BattleShip> funcBattleShip =
            sLine -> new BattleShip(Utils.parseCVLine(sLine));

    public static void main(String[] args) {

//        List<BattleShip> alShips = Utils.genListLoad("data_files/Battleships.csv", csvLine -> new BattleShip(Utils.parseCVLine(csvLine)));
        List<BattleShip> alShips = Utils.genListLoad("data_files/Battleships.csv", funcBattleShip);

        // count of all battle ships

        // count of battle ships of a particular type



    }

}
