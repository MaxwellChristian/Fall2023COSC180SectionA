package lo_oop;

import java.util.Arrays;

public class Shop {

    private String title;
    private String []owners;
    private Shop[] adjacentShops;

    private int shopCounter = 0;

    public Shop(String title) {
        this.title = title;
    }

    public Shop(String title, String[] owners) {
        this.title = title;
        this.owners = owners;
    }

    public Shop(String title, String[] owners, Shop[] adjacentShops) {
        this.title = title;
        this.owners = owners;
        this.adjacentShops = adjacentShops;
    }

    public String getTitle() {
        return title;
    }

    public String[] getOwnerList() {
        return owners;
    }

    public Shop[] getAdjacentShops() {
        return adjacentShops;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "title='" + title + '\'' +
                ", owners=" + Arrays.toString(owners) +
                ", adjacentShops=" + Arrays.toString(adjacentShops) +
                '}';
    }

    public boolean addAjacent(Shop adjacentShop){
        if( shopCounter < 2 ){
            adjacentShops[shopCounter] = adjacentShop;
            shopCounter++;
            return true;
        }
        else {
            return false;
        }

    }
}
