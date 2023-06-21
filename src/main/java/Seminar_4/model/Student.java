package Seminar_4.model;
import lombok.*;

@Getter

@EqualsAndHashCode(callSuper = true)

public class Student extends User implements Comparable<Student> {

    private Double gpa; //средний балл
    private String advisor; //руководитель

    public Student(Long id, String fullName, Integer age, String phoneNumber) {
        super(id, fullName, age, phoneNumber);
    }

    @Override
    public int compareTo(Student o) {
        return getFullName().compareTo(o.getFullName());
    }

    public String toString() {
//        int maxlengthFN = studentRepository.getMaxFullName();
//        getFullName() + " ".repeat(Math.max(0, maxlengthFN - getFullName().length()))
        return String.format("Студент: %s\t%s\t%s\t%s", getId(), getFullName(), getAge(), getPhoneNumber());
    }
}
