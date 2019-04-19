package com.operhero.web;

import com.operhero.pojo.User;
import com.operhero.service.SessionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/login/check")
    public String check(User user){
        if(user.getName() != "")
        {
            SessionService.saveUser(user);
            return "redirect:/login/logined";}
        else
        {
            return "redirect:/login";
        }
    }

    @RequestMapping("/login/logined")
    public String logined(Model model, HttpServletRequest httpServletRequest){
        User user = SessionService.getUser();
        if(user == null){
            return "redirect:/login";
        }
        else {
            model.addAttribute("name", user.getName());
            return "logined";
        }
    }
}
