package Seminar_5;

import Seminar_5.controller.StudentController;
import Seminar_5.controller.TeacherController;
import Seminar_5.model.Student;
import Seminar_5.model.StudyGroup;
import Seminar_5.repository.StudentRepository;
import Seminar_5.repository.TeacherRepository;
import Seminar_5.service.StudentService;
import Seminar_5.service.StudyGroupService;
import Seminar_5.service.TeacherService;
import Seminar_5.view.SortType;
import Seminar_5.view.StudentView;
import Seminar_5.view.StudyGroupView;
import Seminar_5.view.TeacherView;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentView view = getStudentView();
//----------------------------------------------------------------------
        view.create("Петр Иванов", 21, "+79216743625", "2МехМат");
        view.create("Светлана Матвийчук", 19, "+79114583254", "3ЭКО");
        view.create("Никита Сидоров", 21, "+79082742254", "4ИнфоТех");
        view.create("Дамир Мухтаров", 18, "+79501256545", "2МехМат");
        view.create("Станислав Азаров", 22, "+79994515843", "4ИнфоТех");
        view.create("Илья Кузьмин", 23, "+79902135493", "2МехМат");
        view.create("Полина Севастьянова", 18, "+79743725498", "3ЭКО");
        view.create("Георгий Шнайдер", 21, "+79324352756", "4ИнфоТех");

        System.out.println("\n---- Учащиеся ----\n");
        System.out.println("---- Без сортировки ----");
        view.sendOnConsole(SortType.NONE);


        System.out.println("\n---- Преподаватели ----\n");

        TeacherView view1 = getTeacherView();
        view1.create("Олег Михайлович Мартынов", 47, "+7905345217", "4ИнфоТех");
        view1.create("Максим Евгеньевич Кузнецов", 41, "+79113840432", "2МехМат");
        view1.create("Татьяна Владимировна Азарова", 53, "+79123462387", "3ЭКО");
        view1.create("Виктория Дмитриевна Лаушкина", 33, "+79164563421", "1Био");
        view1.create("Андрей Геннадьевич Чапилев", 62, "+79222345427", "4ИнфоТех");

        int a = view.getMaxFullName();

        System.out.println("---- Без сортировки ----");
        view1.sendOnConsole(SortType.NONE);
//

        StudyGroupView studyGroupView = new StudyGroupView();

        view1.viewTeacher(view1.getById(4));
        view.viewStudent(view.getById(3));
        view.viewStudent(view.getById(9));


        String nameGr = studyGroupView.getValue("\nВведите группу: ");

        StudyGroupService studService = new StudyGroupService(view1.getAll(), view.getAll());
        view1.viewGroupTeachers(studService.createTeacherGroup(nameGr));
        view.viewGroupStudents(studService.createStudentGroup(nameGr));


    }



    private static StudentView getStudentView() {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
        return new StudentView(controller);
    }

    public static TeacherView getTeacherView() {
        TeacherRepository repository = new TeacherRepository();
        TeacherService service = new TeacherService(repository);
        TeacherController controller = new TeacherController(service);
        return new TeacherView(controller);
    }

}
