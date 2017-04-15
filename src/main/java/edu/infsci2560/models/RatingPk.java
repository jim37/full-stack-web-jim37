package edu.infsci2560.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author kolobj
 */
@Embeddable
public class RatingPk implements Serializable {
    // http://www.thejavageek.com/2014/05/01/jpa-embeddedid-example/

    private Long carId;
    private Long customerId;

    public RatingPk() {

    }

    public RatingPk(Long carId, Long customerId) {
        this.carId = carId;
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RatingPk other = (RatingPk) obj;
        if ( !Objects.equals(other.carId, carId) )
            return false;

        return Objects.equals(other.getCustomerId(), getCustomerId());

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.getCarId());
        hash = 29 * hash + Objects.hashCode(this.getCustomerId());
        return hash;
    }

    /**
     * @return the dvdId
     */
    public Long getCarId() {
        return carId;
    }

    /**
     * @param dvdId the dvdId to set
     */
    public void setCarId(Long carId) {
        this.carId = carId;
    }

    /**
     * @return the customerId
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

}