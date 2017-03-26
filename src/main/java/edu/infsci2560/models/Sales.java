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
public class Sales {

    private static final long serialVersionUID = 1L;

    public enum CarType {
        Unknown,
        Strength,
        Cardio,
        CrossTrain
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected CarType carType;

    public Sales() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.carType = CarType.Unknown;
    }

    public Sales(Long id, String name, CarType carType) {
        this.id = id;
        this.title = name;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", carType=" + this.carType + " ]";
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

}