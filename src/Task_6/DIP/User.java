package Task_6.DIP;

public class User {
    Calculation calculation;

    public User(Calculation calculation) {
        this.calculation = calculation;
    }
    public void start(){
        calculation.start();
    }
}
