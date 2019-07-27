package pti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pti.dao.EventDAO;
import pti.dao.LessonDAO;
import pti.dao.UserDAO;
import pti.models.Event;
import pti.models.Lesson;
import pti.models.User;
import java.util.List;

@Controller
public class AdminController {
    private UserDAO userDAO;
    private EventDAO eventDAO;
    private LessonDAO lessonDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Autowired
    public void setUserDAO(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    @Autowired
    public void setLessonDAO(LessonDAO lessonDAO) {
        this.lessonDAO = lessonDAO;
    }

    @PostMapping("/users/{id}")
    @ResponseBody
    public void editUser(@PathVariable(value = "id") int id,
                         @RequestBody User userDetails) {
        userDAO.edit(id, userDetails);
    }

    @PostMapping("/users")
    @ResponseBody
    public void addUser(@RequestBody User user) {
        userDAO.add(user);
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> getUsers() {
        List<User> userList = userDAO.listAll("User");
        return userList;
    }

    @DeleteMapping("/users/{id}")
    @ResponseBody
    public void deleteUser(@PathVariable(value = "id") int id) {

        userDAO.delete(id);
    }

    @PostMapping("/events/{id}")
    @ResponseBody
    public void editEvent(@PathVariable(value = "id") int id,
                         @RequestBody Event details) {
        eventDAO.edit(id, details);
    }

    @PostMapping("/events")
    @ResponseBody
    public void addEvent(@RequestBody User user) {
        eventDAO.add(user);
    }


    @DeleteMapping("/events/{id}")
    @ResponseBody
    public void deleteEvent(@PathVariable(value = "id") int id) {

        eventDAO.delete(id);
    }

    @PostMapping("/schedule")
    @ResponseBody
    public void addLesson(@RequestBody Lesson lesson) {
        System.out.println(lesson.getGroup_name());
        lessonDAO.add(lesson);
    }

    @PostMapping("/schedule/{id}")
    @ResponseBody
    public void editLesson(@PathVariable(value = "id") int id,
                           @RequestBody Lesson details) {
        lessonDAO.edit(id, details);
    }

    @DeleteMapping("/schedule/{id}")
    @ResponseBody
    public void deleteLesson(@PathVariable(value = "id") int id) {

        lessonDAO.delete(id);
    }
}
