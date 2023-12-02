package Task_4;

public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();
        controller.create("Иванова", "Анна", "Александровна");
        controller.create("Петров", "Петр", "Петрович");
        controller.create("Сидоров", "Сидор", "Сидорович");
        controller.create("Васильев", "Василий", "Васильевич");
        controller.sendOnConsole();
    }

}
