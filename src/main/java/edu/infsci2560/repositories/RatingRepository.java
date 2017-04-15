package edu.infsci2560.repositories;

import edu.infsci2560.models.Rating;
import edu.infsci2560.models.RatingPk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RatingRepository extends PagingAndSortingRepository<Rating, RatingPk> {
    Page<Rating> findByRatingPkCarId(Long carId, Pageable pageable);
}