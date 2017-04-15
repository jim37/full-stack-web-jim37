package edu.infsci2560.controllers;

import edu.infsci2560.models.Car;
import edu.infsci2560.repositories.CarRepository;
import edu.infsci2560.repositories.RatingRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.data.domain.PageRequest;


@Controller
public class CarEditController {
    @Autowired
    private CarRepository carRepository;

    @Autowired
    private RatingRepository ratingRepository;

    @RequestMapping(value = "cars/edit/{id}", method = RequestMethod.GET)
    public ModelAndView index(@PathVariable Long id) {
        ModelAndView mv = new ModelAndView("carEdit");
        Car car = carRepository.findOne(id);
        mv.addObject("car", car);
//        mv.addObject("ratings", ratingRepository.findAll());
        mv.addObject("ratings", ratingRepository.findByRatingPkCarId(car.getId(), new PageRequest(0, 10)));
        return mv;
    }

    @RequestMapping(value = "cars/edit/{id}",
            method = RequestMethod.PUT,
            consumes="application/x-www-form-urlencoded",
            produces = "application/json")
    public String update( @Valid Car car, BindingResult result) {
        carRepository.save(car);
        return "redirect:/cars";
    }
}