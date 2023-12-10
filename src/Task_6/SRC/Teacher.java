package Task_6.SRC;

public class Teacher{
    private int teacherId;

    public Teacher(int teacherId, String firstName, String secondName, String lastName) {
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

}
