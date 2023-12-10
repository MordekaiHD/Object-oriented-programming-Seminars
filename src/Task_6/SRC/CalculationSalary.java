package Task_6.SRC;

public class CalculationSalary {
    private int baseSalary;

    public CalculationSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    private double alculatingTeachersSalaries(){
        return baseSalary * 1.5;
    }
}
