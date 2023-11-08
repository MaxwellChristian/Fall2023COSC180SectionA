package lo_oop;

public class PersonName {

    String salutation;
    String first;
    String middle;
    String last;

    public PersonName() {
    }

    public PersonName(String salutation, String first, String middle, String last) {
        this.salutation = salutation;
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "PersonName{" +
                "salutation='" + salutation + '\'' +
                ", first='" + first + '\'' +
                ", middle='" + middle + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
