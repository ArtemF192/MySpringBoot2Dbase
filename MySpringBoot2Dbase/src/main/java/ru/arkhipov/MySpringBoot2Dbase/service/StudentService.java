package ru.arkhipov.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySpringBoot2Dbase.entity.Student;
import ru.arkhipov.MySpringBoot2Dbase.exception.CreationException;
import ru.arkhipov.MySpringBoot2Dbase.exception.NotFoundException;

import java.util.List;

@Service
public interface StudentService {

    List<Student> getAllStudents();

    Student createStudent(Student student) throws CreationException;

    Student updateStudent(Student student) throws NotFoundException;

    Student getStudent(int id) throws NotFoundException;

    int deleteStudent(int id) throws NotFoundException;
}
