/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Manager;
import edu.infsci2560.repositories.ManagerRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jim37
 */
@Controller
public class ManagerController {
    @Autowired
    private ManagerRepository repository;
    
    @RequestMapping(value = "managers", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("managers", "managers", repository.findAll());
    }
    
    @RequestMapping(value = "managers/add", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Manager manager, BindingResult result) {
        repository.save(manager);
        return new ModelAndView("managers", "managers", repository.findAll());
    }
	
    @RequestMapping(value = "/managers/add.htm", method = RequestMethod.POST)
    public @ResponseBody
    Manager add(HttpServletRequest request, HttpServletResponse response)
    throws Exception {
 
        Manager manager = new Manager();
 
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
 
        manager.setEmail(email);
        manager.setFirstName(firstName);
        manager.setLastName(lastName);
 
        return manager;
    }
    
}