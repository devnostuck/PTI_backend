package pti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pti.dao.EventDAO;
import pti.dao.LessonDAO;
import pti.models.Event;
import pti.models.Lesson;

import java.util.List;

@Controller
public class CommonController {
    private EventDAO eventDAO;
    private LessonDAO lessonDAO;

    @Autowired
    public void setUserDAO(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    @Autowired
    public void setLessonDAO(LessonDAO lessonDAO) {
        this.lessonDAO = lessonDAO;
    }

    @GetMapping("/events")
    @ResponseBody
    public List<Event> getEvents() {
        List<Event> eventList = eventDAO.listAll("Event");
        return eventList;
    }

    @GetMapping("/schedule")
    @ResponseBody
    public List<Lesson> getLessons() {
        List<Lesson> lessonList = lessonDAO.listAll("Lesson");
        return lessonList;
    }

}
