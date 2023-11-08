package lo_oop;

import javax.swing.plaf.IconUIResource;

public class Location {

    private double maxValue;
    private  int atRow;
    private  int atColInRow;

    public Location(double maxValue, int atRow, int atColInRow) {
        this.maxValue = maxValue;
        this.atRow = atRow;
        this.atColInRow = atColInRow;
    }

    public static Location locateLargest(double[][] values) {

        double foundMaxValue = values[0][0];
        int foundR = 0;
        int foundC = 0;

        for( int r = 0 ; r < values.length ; r++ ) {
            for (int c = 0; c < values[r].length; c++) {
                if( values[r][c] > foundMaxValue ){
                    foundMaxValue = values[r][c];
                    foundR = r;
                    foundC = c;
                }
            }
        }

        return new Location(foundMaxValue, foundR, foundC);
    }

    @Override
    public String toString() {
        return maxValue +
                " at (" + atRow +
                ", " + atColInRow + ")";
    }
}
