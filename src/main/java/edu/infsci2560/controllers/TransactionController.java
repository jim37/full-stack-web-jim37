/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Transaction;
import edu.infsci2560.repositories.TransactionRepository;
import edu.infsci2560.models.Car;
import edu.infsci2560.repositories.CarRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
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
public class TransactionController {
    @Autowired
    private TransactionRepository repository;
    private CarRepository carRepository;
    
    @RequestMapping(value = "order", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("order", "order", repository.findAll());
    }


    @RequestMapping(value = "order/add/{id}", method = RequestMethod.PUT, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView delete( @Valid Car car, BindingResult result) {
        Transaction order = new Transaction(car.getId(), car.getPrice());
        repository.save(order);
        return new ModelAndView("order", "order", repository.findAll());
    }
    
}