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
public class Transaction {

    private static final long serialVersionUID = 1L;

    public enum TransactionType {
        Unknown,
        Business,
        Individual
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String time;
    protected TransactionType transactionType;

    public Transaction() {
        this.id = Long.MAX_VALUE;
        this.time = null;
        this.transactionType = TransactionType.Unknown;
    }

    public Transaction(Long id, String tim, TransactionType transactionType) {
        this.id = id;
        this.time = tim;
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", time=" + this.time + ", transactionType=" + this.transactionType + " ]";
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
     * @return the tim
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the tim to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the transactionType
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * @param transactionType the transactionType to set
     */
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
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