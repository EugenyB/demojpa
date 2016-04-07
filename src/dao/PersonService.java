package dao;

import data.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by eugeny on 05.04.2016.
 */
@Stateless
public class PersonService {
    @PersistenceContext
    EntityManager em;

    public List<Person> findAll() {
        return em.createQuery("select p from Person p").getResultList();
//        return new ArrayList<>(Arrays.asList(
//                new Person(1, "Иван", "Иванов", 20, "12345"),
//                new Person(2, "Борис", "Сидоров", 19, "11111"),
//                new Person(3, "Василий", "Петров", 22, "54321"),
//                new Person(4, "Арсений", "Вайт", 21, "23234")
//        ));
    }
}
