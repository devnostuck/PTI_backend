package pti.models;

public class Lesson {

    int id;
    String groupa;
    String week_color;
    String day;
    int para;
    String lesson_name;
    String teacher;
    String room;
    String type;

    public Lesson() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupa() {
        return groupa;
    }

    public void setGroupa(String groupa) {
        this.groupa = groupa;
    }

    public String getWeek_color() {
        return week_color;
    }

    public void setWeek_color(String week_color) {
        this.week_color = week_color;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getPara() {
        return para;
    }

    public void setPara(int para) {
        this.para = para;
    }

    public String getLesson_name() {
        return lesson_name;
    }

    public void setLesson_name(String lesson_name) {
        this.lesson_name = lesson_name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
