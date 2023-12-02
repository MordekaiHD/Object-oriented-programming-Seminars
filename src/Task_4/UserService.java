package Task_4;

public interface UserService <T extends User>{
    void create(String firstName, String secondName, String lastName);
}
