package Praktik;

public class Stream implements Comparable<Stream> {
    private int studendId;
    private String firstName;
    private String secondName;
    private String lastName;

    public Student(int studendId, String firstName, String secondName, String lastName) {
        this.studendId = studendId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    public int getStudendId() {
        return studendId;
    }

    public void setStudendId(int studendId) {
        this.studendId = studendId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Studentу{" +
                "studendId=" + studendId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (studendId > o.getStudendId())
            return 1;
        if (studendId < o.getStudendId())
            return -1;
        return 0;
    }
}
