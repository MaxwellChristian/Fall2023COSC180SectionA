package lo_oop;

public class ContactNumber {

    private int isdCode;
    private int callingNumber;

    public ContactNumber() {
    }

    public ContactNumber(int isdCode, int callingNumber) {
        this.isdCode = isdCode;
        this.callingNumber = callingNumber;
    }

    public int getIsdCode() {
        return isdCode;
    }

    public void setIsdCode(int isdCode) {
        this.isdCode = isdCode;
    }

    public int getCallingNumber() {
        return callingNumber;
    }

    public void setCallingNumber(int callingNumber) {
        this.callingNumber = callingNumber;
    }

    /*
    @Override
    public String toString() {
        return "ContactNumber{" +
                "isdCode=+" + isdCode +
                ", callingNumber=" + callingNumber +
                '}';
    }
*/
    @Override
    public String toString() {
        return "(+" + isdCode + ")" +
                callingNumber;
    }
}
