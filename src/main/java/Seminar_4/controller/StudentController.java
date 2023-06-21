package Seminar_4.controller;
import Seminar_4.service.StudentService;
import Seminar_4.model.Student;
import Seminar_4.service.UserService;

import java.util.List;

public class StudentController implements UserController<Student> {

    public UserService<Student> studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentService.create(fullName, age, phoneNumber);
    }

    @Override
    public List<Student> getAllSortUsers() {
        return studentService.getAllSortUsers();
    }

    @Override
    public List<Student> getAllSortUsersByFamilyName() {
        return studentService.getAllSortUsersByFamilyName();
    }

    @Override
    public boolean removeUser(String fullName) {
        studentService.removeUser(fullName);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public List<Student> getAllSortUsersByAge() {
        return studentService.getAllSortUsersByAge();
    }

    @Override
    public int getMaxFullName() {
        return studentService.getMaxFullName();
    }

    @Override
    public void buttonClickID() {

    }
}
