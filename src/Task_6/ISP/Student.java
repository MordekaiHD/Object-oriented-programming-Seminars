package Task_6.ISP;

public class Student implements CalculatingStudentScholarships {
    private double hourlyAttendance;

    public Student(double hourlyAttendance) {
        this.hourlyAttendance = hourlyAttendance;
    }

    public double getHourlyAttendance() {
        return hourlyAttendance;
    }

    public void setHourlyAttendance(double hourlyAttendance) {
        this.hourlyAttendance = hourlyAttendance;
    }

    @Override
    public double calculationScholarship() {
        return hourlyAttendance * 2.3;
    }
}
