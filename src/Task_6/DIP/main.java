package Task_6.DIP;

public class main {
    public static void main(String[] args) {
        User user = new User(new Teacher());
        user.start();
        user = new User(new Student());
        user.start();

    }
}
