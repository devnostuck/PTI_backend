package pti;

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


    @GetMapping("/users")
    @ResponseBody
    public List<User> getShedule()  throws SQLException, IOException, ServletException  {
        String url = "jdbc:mysql://localhost:3306/ptidb?serverTimezone=UTC";
        String name = "root";
        String password = "777";
        UserDAO userDAO = new UserDAO(url, name, password);
        List<User> userList = userDAO.listAllUsers();

        return userList;
    }
}
