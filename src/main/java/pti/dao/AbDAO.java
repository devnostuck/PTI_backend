package pti.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pti.models.Model;
import java.util.List;

@Repository
public abstract class AbDAO {
    protected SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Transactional
    public List listAll(String tablename) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from " + tablename).list();
    }

    @Transactional
    public void add(Model model) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(model);
    }

    @Transactional
    public Object get(int id) {

        return null;
    }

    @Transactional
    public void edit(int id, Model m) {

    }

    @Transactional
    public void delete(int id) {

    }
}
