package lesson_9;

import lombok.Data;


@Data
public class Student implements Comparable<Student> {

    private final long id;
    private final String fullName;

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }
}
