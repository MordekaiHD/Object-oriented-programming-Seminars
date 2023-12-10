package Task_6.LSP;

public class Teacher extends User{
    private int hoursWork;
    private  int hourlyRate;

    public Teacher(int hoursWork, int hourlyRate) {
        this.hoursWork = hoursWork;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int baseSalary() {
        return hoursWork * hourlyRate;
    }
}
