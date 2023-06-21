package Seminar_4.service;
import Seminar_4.model.Student;
import Seminar_4.model.User;

import java.util.List;

public interface UserService<T extends User> {
    void create(String fullName, Integer age, String phoneNumber);
    List<T> getAll();
    List<T> getAllSortUsers();
    List<T> getAllSortUsersByFamilyName();
    List<T> getAllSortUsersByAge();
    void removeUser(String fullName);
    int getMaxFullName();
    void buttonClickID();

}
