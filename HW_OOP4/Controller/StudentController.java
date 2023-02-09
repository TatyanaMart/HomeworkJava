package HW_OOP4.Controller;

import HW_OOP4.Model.Student;
import HW_OOP4.Model.Teacher;
import HW_OOP4.Model.User;
import HW_OOP4.Service.impls.StudentServiceImpl;

//Контроллер
public class StudentController {
    private final StudentServiceImpl<Student> studentService = new StudentServiceImpl<>();
    public void getStudentInfo(String name, float grade, int year, Teacher teacher){
        studentService.add(new Student(name, grade, year, teacher));
    }
}
