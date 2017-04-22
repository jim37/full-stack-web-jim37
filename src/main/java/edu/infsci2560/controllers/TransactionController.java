/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.controllers;

import edu.infsci2560.models.Transaction;
import edu.infsci2560.repositories.TransactionRepository;
\import edu.infsci2560.models.Car;
import edu.infsci2560.repositories.CarRepository;
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
public class TransactionController {
    @Autowired
    private TransactionRepository repository;
    
    @RequestMapping(value = "order", method = RequestMethod.GET)
    public ModelAndView index() {        
        return new ModelAndView("transactions", "transactions", repository.findAll());
    }
    
    @RequestMapping(value = "order/add/{id}", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@PathVariable Long id) {
        Car car = carRepository.findOne(id);
        Transaction order = new Transaction(car.id, car.price)
        repository.save(order);
        return new ModelAndView("order", "order", repository.findAll());
    }
    
}