package data;

import java.util.List;
import java.util.Objects;

/**
 * Created by eugeny on 06.04.2016.
 */
public class Course {
    private int id;
    private String title;
    private int hours;
    private List<Mark> marks;

    public Course(int id, String title, int hours) {
        this.id = id;
        this.title = title;
        this.hours = hours;
    }

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return id == course.id &&
                hours == course.hours &&
                Objects.equals(title, course.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, hours);
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}
