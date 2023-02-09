package HW_OOP4.Service;

import HW_OOP4.Model.Student;
import HW_OOP4.Model.User;

import java.util.List;

public interface StudentService<T extends User> {
    void add(Student student);
    void remove(Student student);
    void addAppend(Student student);
    void read();
    List<Student> getAllStudents();
}