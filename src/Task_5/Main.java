package Task_5;

import Task_5.Controller.Controller;
import Task_5.Model.StudyGroup;
import Task_5.Servis.StudyGroupService;
import Task_5.View.ViewGroup;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService);

        // Создание учебной группы с указанными ID преподавателя и студентов
        StudyGroup studyGroup = controller.createStudyGroupWithIds(101, List.of(1, 2, 3));

        // Вывод информации о созданной учебной группе с использованием нового класса
        ViewGroup.printStudyGroup(studyGroup);
    }
}
