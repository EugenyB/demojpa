package dao;

import data.Course;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by eugeny on 06.04.2016.
 */
@Stateless
public class CourseService {
    public List<Course> findAll() {
        return new ArrayList<>(Arrays.asList(
                new Course(1, "ООП", 30),
                new Course(2, "Базы данных", 40),
                new Course(3, "Web-технологии", 36)
        ));
    }
}
