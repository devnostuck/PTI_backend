package pti.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import pti.models.Model;
import pti.models.User;

@Repository
public class UserDAO extends AbDAO {

    @Override
    public User get(int id) {
        Session session = sessionFactory.getCurrentSession();

        return session.find(User.class, id);
    }

    @Override
    public void edit(int id, Model model) {
        Session session = sessionFactory.getCurrentSession();
        User userToEdit = get(id);
        User user = (User)model;
        userToEdit.setUsername(user.getUsername());
        userToEdit.setPassword(user.getPassword());
        userToEdit.setFirst_name(user.getFirst_name());
        userToEdit.setLast_name(user.getLast_name());
        userToEdit.setPatronymic(user.getPatronymic());
        userToEdit.setAge(user.getAge());
        userToEdit.setGender(user.getGender());
        userToEdit.setRole(user.getRole());
        userToEdit.setDepartment(user.getDepartment());
        userToEdit.setGroupname(user.getGroupname());
        session.update(userToEdit);
    }

    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(session.find(User.class,id));
    }
}
