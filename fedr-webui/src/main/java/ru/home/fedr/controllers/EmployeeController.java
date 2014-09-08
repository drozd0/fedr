package ru.home.fedr.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.home.fedr.services.UserService;

import java.security.Principal;

@Controller
@RequestMapping("/employee")
@PreAuthorize("hasAnyRole('ROLE_USER')")
public class EmployeeController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView init(Principal principal){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", userService.loadUserByUsername(principal.getName()) );
        modelAndView.setViewName("employee");
        return modelAndView;
    }
}
