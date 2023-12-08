package Task_5.Servis;

import Task_5.Model.Student;
import Task_5.Model.StudyGroup;
import Task_5.Model.Teacher;

import java.util.List;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> studentList){
        return new StudyGroup(teacher, studentList);
    }
}
