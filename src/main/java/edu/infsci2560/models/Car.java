/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author jim37
 */
@Entity
public class Car {

    private static final long serialVersionUID = 1L;

    public enum CarType {
        SUV,
        Truck,
        SportsCar,
        LuxuryCar,
        Other,
        --Select--
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected CarType carType;
    protected String price;
    protected String description;

    public Car() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.carType = CarType.Other;
        this.price = null;
        this.description = null;
    }

    public Car(Long id, String name, CarType carType, String price, String description) {
        this.id = id;
        this.title = name;
        this.carType = carType;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", carType=" + this.carType + ", price=" + this.price + ", description=" + this.description + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the workoutType
     */
    public CarType getCarType() {
        return carType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }
     public void setPrice(String price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}