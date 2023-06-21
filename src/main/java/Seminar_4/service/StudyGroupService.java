package Seminar_4.service;
import Seminar_4.model.StudyGroup;
import Seminar_4.model.Teacher;


import java.util.List;

public class StudyGroupService extends StudyGroup {
    public StudyGroupService(Integer teacher, List<Integer> students) {
        super(teacher, students);
    }

    public void createStudyGroup(StudyGroup sg){
        System.out.println(sg);

    }
}
