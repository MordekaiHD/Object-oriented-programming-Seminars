package Task_4;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    @Override
    public void sendOnConsole() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }

    @Override
    public void editTeacher(int teacherId, String newFirstName, String newLastName) {
        TeacherService.updateTeacher(teacherId, newFirstName, newLastName);
    }

}
