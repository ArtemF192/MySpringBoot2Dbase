package ru.arkhipov.MySpringBoot2Dbase.dao;



import ru.arkhipov.MySpringBoot2Dbase.entity.Student;
import ru.arkhipov.MySpringBoot2Dbase.exception.NotFoundException;

import java.util.List;


public interface StudentDAO {
    List<Student> getAllStudents();

    Student createStudent(Student student);

    Student updateStudent(Student student) throws NotFoundException;

    Student getStudent(int id);

    int deleteStudent(int id);
}
