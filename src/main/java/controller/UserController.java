package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello_html")
    public String hello_html(){
        return "hello_html";
    }

    @GetMapping("/users")
    public String getAllUsers(Model model){
        model.addAttribute("users", userService.findAll());
        return "usersList";
    }

    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "showUser";
    }

    @GetMapping("/add-user")
    public String createUserPage(){
        return "createUser";
    }

    @PostMapping("/add-user")
    public String addUser(@ModelAttribute("user") User user){
        userService.save(user);
        return "redirect:/users";
    }
}
