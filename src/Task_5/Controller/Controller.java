package Task_5.Controller;

import Task_5.Model.Student;
import Task_5.Model.StudyGroup;
import Task_5.Model.Teacher;
import Task_5.Servis.StudyGroupService;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }
    public StudyGroup createStudyGroupWithIds(int teacherId, List<Integer> studentIds){
        Teacher teacher = new Teacher(teacherId, "Преподаватель");
        List<Student> students = new ArrayList<>();
        for (int studentId : studentIds){
            students.add(new Student(studentId, "Студент " + studentId));
        }
        return studyGroupService.createStudyGroup(teacher,students);
    }
}
