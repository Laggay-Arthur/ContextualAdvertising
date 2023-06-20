package com.contextadvertising.demo.Controller;

import com.contextadvertising.demo.Auth;
import com.contextadvertising.demo.Dao.ConnectionDB;
import com.contextadvertising.demo.Dao.UserDAO;
import com.contextadvertising.demo.Dao.UsersDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
public class authController {
    @GetMapping("/auth")
    public String home(Model model){
        model.addAttribute("auth", new Auth());
        return "auth";
    }
    @PostMapping("/auth")
    public void homeForm(@ModelAttribute Auth auth) throws SQLException {
        ConnectionDB.open();
        UsersDAO.insertUser(ConnectionDB.connection, auth.getFirst_name(), auth.getLast_name(), auth.getPassword(), auth.getEmail(), auth.getPhone());
        ConnectionDB.close();
}
}