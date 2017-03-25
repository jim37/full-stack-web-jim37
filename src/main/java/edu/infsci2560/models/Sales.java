/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

public class Sales {    
    private final int id;
    private final String carId;
    
    public Sales() {
        this.id = 0;
        this.carId = null;
    }

    public Sales(int id, String id) {
        this.id = id;
        this.carId = id;
    }

    public int getId() {
        return id;
    }

    public String getCarId() {
        return id;
    }

}
