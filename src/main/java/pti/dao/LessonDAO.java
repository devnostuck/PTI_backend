package pti.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import pti.models.Lesson;
import pti.models.Model;

@Repository
public class LessonDAO extends AbDAO {
    @Override
    public Lesson get(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.find(Lesson.class, id);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.find(Lesson.class,id));
    }

    @Override
    public void edit(int id, Model model) {
        Session session = sessionFactory.getCurrentSession();
        Lesson lessonToEdit = get(id);
        Lesson lesson = (Lesson) model;
       /* String newGroup = lesson.getLesson_name();
        String newName = lesson.getLesson_name();
        String newDate = lesson.getDate();
        String newTeacher = lesson.getTeacher();
        String newRoom=lesson.getRoom();

        lessonToEdit.setLesson_name(newName == null ?
                lessonToEdit.getLesson_name() : newName);
        lessonToEdit.setGroup_name(newGroup == null ?
                lessonToEdit.getGroup() : newGroup);
        lessonToEdit.setDate(newDate == null ?
                lessonToEdit.getDate() : newDate);
        lessonToEdit.setTeacher(newDate == null ?
                lessonToEdit.getTeacher() : newTeacher);
        lessonToEdit.setLesson_name(newRoom == null ?
                lessonToEdit.getRoom() : newRoom);*/

        session.update(lessonToEdit);
    }
}
