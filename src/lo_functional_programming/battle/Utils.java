package lo_functional_programming.battle;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Utils {
    /**
     * This will take a line in that will be a csv line
     * and break it up into an array of strings.  It handles
     * the Excel practice of including , with strings with the
     * field actually does have a comma
     *
     * @param sLine
     * @return
     */
    public static String[] parseCVLine(String sLine) {
        String sPattern = ",(?=([^\"]*\"[^\"]*\")*(?![^\"]*\"))";

        String[] sFields = sLine.split(sPattern);

        for (int i = 0; i < sFields.length; i++) {
            sFields[i] = sFields[i].replace("\"", "");
        }
        return sFields;
    }

    /**
     * THis method will read a series of entries from a csv file and then
     * add them to an array List of Type T given that Function func is taking in a string
     * and returning an object of type T
     *
     * @param sFile
     * @param func
     * @param <T>
     * @return
     */
    public static <T> List<T> genListLoad(String sFile, Function<String, T> func) {
        ArrayList<T> lstReturn = new ArrayList<>();

        try (Scanner obIn = new Scanner(new File(sFile))) {
            obIn.nextLine();

            while (obIn.hasNextLine()) {
                lstReturn.add(func.apply(obIn.nextLine()));
            }

        } catch (Exception exp) {
            System.out.println(exp.getMessage());

        }

        return lstReturn;
    }

}
