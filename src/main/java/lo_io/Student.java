package lo_io;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {

    int studentId;
    String name;
    Date DOB;

    public Student() {
    }

    public Student(int studentId, String name, Date DOB) {
        this.studentId = studentId;
        this.name = name;
        this.DOB = DOB;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
