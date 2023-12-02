package Task_4;

public interface UserController <T extends User>{
    void create(String firstName, String secondName, String lastName);
    void sendOnConsole();
    void editTeacher(int teacherId, String newFirstName, String newLastName);
}
