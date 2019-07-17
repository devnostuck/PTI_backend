package pti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pti.dao.UserDAO;
import pti.models.User;
import javax.servlet.ServletException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


@Controller
public class CommonController {

    private UserDAO userDAO;

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!initedDAO");
        this.userDAO = userDAO;
    }

    @GetMapping("/users")
    @ResponseBody
    public List<User> getShedule()  throws SQLException, IOException, ServletException  {
        System.out.println(userDAO);
        List<User> userList = userDAO.listAllUsers();

        return userList;
    }
}
