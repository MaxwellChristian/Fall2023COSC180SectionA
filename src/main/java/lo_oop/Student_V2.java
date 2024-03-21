package lo_oop;

public class Student_V2 {

    private Integer id;

    private PersonName name;
    private DOB dateOfBirth;

    private ContactNumber contactNumber1;

    private String email;

    Address address1;
    Address address2;

    private Biometrics biometricData;

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address2) {
        this.address2 = address2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student_V2{" +
                "id=" + id +
                ", name=" + name +
                ", dateOfBirth=" + dateOfBirth +
                ", contactNumber1=" + contactNumber1 +
                ", email='" + email + '\'' +
                ", address1=" + address1 +
                ", address2=" + address2 +
                ", biometricData=" + biometricData +
                '}';
    }
}
