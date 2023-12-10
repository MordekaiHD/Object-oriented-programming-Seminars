package Task_6.DIP;

public class Teacher implements Calculation{
    @Override
    public void start() {
        System.out.println("Зарплата рассчитана");
    }
}
