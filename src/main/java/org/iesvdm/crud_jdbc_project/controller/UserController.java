package org.iesvdm.crud_jdbc_project.controller;


import org.iesvdm.crud_jdbc_project.model.Piramide;
import org.iesvdm.crud_jdbc_project.model.User;
import org.iesvdm.crud_jdbc_project.util.HashUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class UserController {
    private HashUtil hashUtil;

    @GetMapping("/user")
    public String user(Model model, @ModelAttribute User user) {

        model.addAttribute("user", user);

        return "/user";
    }

    @PostMapping("/user")
    public String userSubmit(Model model, @ModelAttribute User user){

        model.addAttribute("username", user.getUsername());

        model.addAttribute("password", user.getPassword());

        return "/user";
    }

    @GetMapping("/piramide")
    public String piramide(Model model, @ModelAttribute Piramide piramide){

        model.addAttribute("numero", piramide);

        return "/piramide";

    }

    @PostMapping("/piramide")
    public String piramideSubmit(Model model, @ModelAttribute Piramide piramide){
        int numero = piramide.getNumero();
        List<Integer> piramideImprimir = IntStream.rangeClosed(1,numero)
                        .boxed()
                        .collect(Collectors.toList());
        model.addAttribute("numero", numero);
        model.addAttribute("piramideImprimir", piramideImprimir);

        return "/piramide";

    }
}
