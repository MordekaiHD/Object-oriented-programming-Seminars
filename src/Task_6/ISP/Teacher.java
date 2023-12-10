package Task_6.ISP;

import Task_4.User;

public class Teacher implements CalculationSalary{
    private int baseSalary;

    public Teacher(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double alculatingTeachersSalaries() {
        return baseSalary * 1.5;
    }
}
