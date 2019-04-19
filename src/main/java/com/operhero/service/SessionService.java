package com.operhero.service;

import com.operhero.pojo.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionService {

    public final static String ADMIN_ROLE="lt.a.user";

    public static void saveObj(String key, Object value){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        HttpSession session = request.getSession();
        session.setAttribute(key, value);
    }

    public static Object getObj(String key){
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        HttpSession session = request.getSession();
        return session!=null?session.getAttribute(key):null;
    }

    public static void saveUser(User user){
        saveObj(ADMIN_ROLE, user);
    }

    public static User getUser(){
        return (User)getObj(ADMIN_ROLE);
    }
}
