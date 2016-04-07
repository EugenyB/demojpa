package data;

/**
 * Created by eugeny on 06.04.2016.
 */
public class Mark {
    private int id;
    private Person person;
    private Course course;
    private int value;

    public Mark(Person person, Course course, int value) {
        this.person = person;
        this.course = course;
        this.value = value;
    }

    public Mark() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
