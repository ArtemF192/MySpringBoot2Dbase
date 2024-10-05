package ru.arkhipov.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.arkhipov.MySpringBoot2Dbase.entity.Discipline;
import ru.arkhipov.MySpringBoot2Dbase.exception.CreationException;
import ru.arkhipov.MySpringBoot2Dbase.exception.NotFoundException;

import java.util.List;

@Service
public interface DisciplineService {

    List<Discipline> getAllDisciplines();

    Discipline createDiscipline(Discipline Discipline) throws CreationException;

    Discipline updateDiscipline(Discipline Discipline) throws NotFoundException;

    Discipline getDiscipline(int id) throws NotFoundException;

    int deleteDiscipline(int id) throws NotFoundException;
}
