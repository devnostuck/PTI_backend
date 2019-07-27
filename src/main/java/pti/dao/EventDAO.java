package pti.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import pti.models.Event;
import pti.models.Model;

@Repository
public class EventDAO extends AbDAO {

    @Override
    public Event get(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.find(Event.class, id);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.find(Event.class,id));
    }

    @Override
    public void edit(int id, Model model) {
        Session session = sessionFactory.getCurrentSession();
        Event eventToEdit = get(id);
        Event event = (Event) model;
        String newName = event.getName();
        String newDesc = event.getDescription();
        String newImg = event.getImage();
        eventToEdit.setName(newName == null ? eventToEdit.getName() : newName);
        eventToEdit.setDescription(newDesc == null ?
                eventToEdit.getDescription() : newDesc);
        eventToEdit.setImage(newImg == null ? eventToEdit.getImage() : newImg);
        session.update(eventToEdit);
    }
}
