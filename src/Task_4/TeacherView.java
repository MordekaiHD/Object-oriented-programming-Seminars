package Task_4;

import java.util.List;

public class TeacherView implements UserView<Teacher>{

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher id : list){
            System.out.println(id);
        }
    }
}
