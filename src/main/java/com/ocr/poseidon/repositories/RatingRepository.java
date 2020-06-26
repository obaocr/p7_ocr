package com.ocr.poseidon.repositories;

import com.ocr.poseidon.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Class for Repository Rating
 */

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {

}
