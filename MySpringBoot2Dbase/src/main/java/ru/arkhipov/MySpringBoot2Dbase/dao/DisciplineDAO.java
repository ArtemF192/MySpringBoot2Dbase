package ru.arkhipov.MySpringBoot2Dbase.dao;

import ru.arkhipov.MySpringBoot2Dbase.entity.Discipline;
import ru.arkhipov.MySpringBoot2Dbase.exception.NotFoundException;

import java.util.List;

public interface DisciplineDAO {
    List<Discipline> getAllDisciplines();

    Discipline createDiscipline(Discipline Discipline);

    Discipline updateDiscipline(Discipline Discipline) throws NotFoundException;

    Discipline getDiscipline(int id);

    int deleteDiscipline(int id);
}
