package com.operhero.web;

import com.operhero.pojo.User;
import com.operhero.service.SessionService;
import com.operhero.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login/check")
    public String check(User user, HttpServletRequest httpServletRequest) {

        if (!user.getName().isEmpty() && !user.getPassword().isEmpty()) {
            User userd = userService.findByUserName(user.getName());
            if (userd != null && userd.getPassword().equals(user.getPassword())) {
                SessionService.saveUser(user);
                return "redirect:/logined";
            }
        }

        return "redirect:/login";
    }

    @RequestMapping("/login/toregist")
    public String toregist(User user, HttpServletRequest httpServletRequest) {
        return "regist";
    }

    @RequestMapping("/login/regist")
    public String regist(User user, HttpServletRequest httpServletRequest) {

        if (!user.getName().isEmpty() && !user.getPassword().isEmpty()) {
            User userd = userService.findByUserName(user.getName());
            if (userd == null) {
                userService.addUser(user);
                SessionService.saveUser(user);
                return "redirect:/logined";
            }
        }

        return "redirect:/login";
    }

    @RequestMapping("/logined")
    public String logined(Model model) {
        User user = SessionService.getUser();
        if (user == null) {
            return "redirect:/login";
        } else {
            model.addAttribute("name", user.getName());
            return "logined";
        }
    }
}
