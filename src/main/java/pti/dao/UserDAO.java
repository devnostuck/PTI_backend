package pti.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pti.models.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

@Repository
public class UserDAO {
        private String jdbcURL;
        private String jdbcUsername;
        private String jdbcPassword;
        private Connection jdbcConnection;

        private SessionFactory sessionFactory;

        @Autowired
        public void setSessionFactory(SessionFactory sessionFactory) {
            this.sessionFactory = sessionFactory;
        }

        /* UserDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
            this.jdbcURL = jdbcURL;
            this.jdbcUsername = jdbcUsername;
            this.jdbcPassword = jdbcPassword;
        }

        protected void connect() throws SQLException {
            if (jdbcConnection == null || jdbcConnection.isClosed()) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    throw new SQLException(e);
                }
                jdbcConnection = DriverManager.getConnection(
                        jdbcURL, jdbcUsername, jdbcPassword);
            }
        }

        protected void disconnect() throws SQLException {
            if (jdbcConnection != null && !jdbcConnection.isClosed()) {
                jdbcConnection.close();
            }
        }
        */
        @Transactional
        public List<User> listAllUsers() {
            System.out.println();

            Session session = sessionFactory.getCurrentSession();
            return session.createQuery("from User").list();
        }

    }
