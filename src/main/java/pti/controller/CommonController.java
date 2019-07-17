package pti.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pti.dao.UserDAO;
import pti.models.Event;
import pti.models.Lesson;
import pti.models.Teacher;
import pti.models.User;
import java.util.List;

@Controller
public class CommonController {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @PostMapping("/users/{id}")
    @ResponseBody
    public void editUser(@PathVariable(value = "id") int id,
                         @RequestBody User userDetails) {
        User userToEdit = userDAO.getUser(id);
        userToEdit.setUsername(userDetails.getUsername());
        userToEdit.setFirst_name(userDetails.getFirst_name());
        userToEdit.setLast_name(userDetails.getLast_name());
        userToEdit.setPatronymic(userDetails.getPatronymic());
        userToEdit.setAge(userDetails.getAge());
        userToEdit.setGender(userDetails.getGender());
        userToEdit.setRole(userDetails.getRole());
        userToEdit.setDepartment(userDetails.getDepartment());
        userToEdit.setGroupname(userDetails.getGroupname());
        System.out.println(userToEdit.getPatronymic());
        userDAO.editUser(userToEdit);
    }

    @PostMapping("/users")
    @ResponseBody
    public void addUser(@RequestBody User user) {
        userDAO.addUser(user);
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> getShedule() {
        System.out.println(userDAO);
        List<User> userList = userDAO.listAllUsers();

        //это для получения json строки
        Event event = new Event();
        event.setDescription("descript");
        event.setName("name");
        event.setImage("/image");
        Teacher teacher = new Teacher();
        Gson gson = new Gson();
        String json = gson.toJson(event);
        System.out.println(json);

        return userList;
    }
}
