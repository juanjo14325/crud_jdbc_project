package org.iesvdm.crud_jdbc_project.controller;

import org.iesvdm.crud_jdbc_project.DAO.UserDAO;
import org.iesvdm.crud_jdbc_project.util.HashUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    private HashUtil hashUtil;
    @GetMapping("/user")
    public String user(Model model, @ModelAttribute UserDAO userDAO){
        return null;
    }
}
