package pti.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class Lesson implements Model {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "lesson_date")
    private String lessonDate;

    @Column(name = "lesson_name")
    private String name;

    @Column(name = "teacher")
    private String teacher;

    @Column(name = "room")
    private String room;

    public Lesson() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getGroup_name() {
        return groupName;
    }

    public void setGroup_name(String group_name) {
        this.groupName = group_name;
    }

    public String getLesson_date() {
        return lessonDate;
    }

    public void setLesson_date(String date) {
        this.lessonDate = date;
    }

    public String setLesson_name() {
        return name;
    }

    public void setLesson_name(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
