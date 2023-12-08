package Task_5.View;

import Task_5.Model.Student;
import Task_5.Model.StudyGroup;

public class ViewGroup {
    public static void printStudyGroup(StudyGroup studyGroup) {
        System.out.println("Учебная группа:");
        System.out.println("Преподаватель: " + studyGroup.getTeacher().getName() + " (ID: " + studyGroup.getTeacher().getId() + ")");
        System.out.println("Студенты:");
        for (Student student : studyGroup.getStudentList()) {
            System.out.println("  " + student.getName() + " (ID: " + student.getId() + ")");
        }
    }
}
