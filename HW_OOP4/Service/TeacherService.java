package HW_OOP4.Service;

import HW_OOP4.Model.Teacher;
import HW_OOP4.Model.User;

import java.util.List;

public interface TeacherService<T extends User> {
    void addTeacher(Teacher teacher);
    void removeTeacher(Teacher teacher);
    void addAppendTeacher(Teacher teacher);
    void readTeacher();
    List<Teacher> getAllTeachers();


}

