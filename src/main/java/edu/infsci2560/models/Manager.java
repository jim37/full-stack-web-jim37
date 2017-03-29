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

@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String firstName;
    private String lastName;
    private String email;
	
	protected Manager() {}
	
	public Manager(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
		this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Manager[firstName='%s', lastName='%s', email='%s']", getFirstName(), getLastName(), getEmail());
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	
	public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;

    }
}