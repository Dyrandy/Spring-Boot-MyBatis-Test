package com.web.Controller;

import com.web.Domain.User;
import com.web.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/register")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping({"/", ""})
    public String GetRegister(Model model){
        return "register";
    }

    @PostMapping({"/", ""})
    public String PostRegister(@RequestParam("id") String username, @RequestParam("pw") String password, Model model){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userService.InsertUser(user);
        return "register";
    }
}
